package Model;

import javax.swing.JTable;

public class TicketService{
    Ticket head;
    Ticket tail;
    int counter;

    public TicketService() {
        head=null;
        tail=null;
    }
        
        public class Ticket{
            private Ticket next;
            private int reference;
            private int busNumber;
            private int nuOfTickets; 
            
                public Ticket(int reference,int busNumber,int nuOfTickets) {
                    next=null;
                    this.busNumber=busNumber;
                    this.nuOfTickets=nuOfTickets;
                    this.reference=reference;
                }

                public int getReference() {
                    return reference;
                }
                
                public int getBusNumber() {
                    return busNumber;
                }

                public int getNuOfTickets() {
                    return nuOfTickets;
                }
        }
                public void insert(int reference,int busNumber,int nuOfTickets){

                    Ticket new_ticket=new Ticket(reference,busNumber,nuOfTickets);
                    new_ticket.next = null;

                    if(isEmpty()){
                        head=new_ticket;
                        tail=new_ticket;
                    }
                    else{
                       tail.next=new_ticket;
                       tail=new_ticket;
                    }
                    counter++;
                }
                
                public boolean isEmpty(){
                    if(head==null)
                        return true;
                    else
                        return false;
                }
                
                public boolean contains(int busNumber){ 
                    Ticket current = head; // Initialize current 
                    while (current != null) 
                    { 
                        if (current.busNumber==busNumber)
                            return true;

                        current = current.next;
                    } 
                    return false; 
                }
                
                public void printList(TicketService list)
                {
                    Ticket currNode = list.head;

                    // Traverse through the LinkedList
                    while (currNode != null) {
                        // Print the data at current node
                        System.out.print(currNode.nuOfTickets+"\n"+currNode.busNumber + "\n");

                        // Go to next node
                        currNode = currNode.next;
                    }
                }
                
                public TicketService.Ticket displaySearchedTicket(int busNumber){
                    TicketService.Ticket current = head; // Initialize current 
                    while (current != null) 
                    { 
                        if (current.busNumber==busNumber)
                            return current;

                        current = current.next; 
                    }
                    return null;
                }
        
                public void fillTable(JTable TicketTable){
                    int j=0;
                    TicketService.Ticket currNod=head;
                            for(int i=0; currNod!=null; i++){
                                    TicketTable.setValueAt(currNod.getReference(), i, j);
                                    TicketTable.setValueAt(currNod.getBusNumber(), i, j+1);
                                    TicketTable.setValueAt(currNod.getNuOfTickets(), i, j+2);

                                currNod=currNod.next;
                           }
                }
}
