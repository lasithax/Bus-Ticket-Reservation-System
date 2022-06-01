package Model;

public class BookTicketModel {
    public static TicketService ticketList=new TicketService();
    
        public void bookTickets(int reference,int busNumber,int numberOfTickets){
            ticketList.insert( reference,busNumber, numberOfTickets);
            ticketList.printList(ticketList);
        }
}
