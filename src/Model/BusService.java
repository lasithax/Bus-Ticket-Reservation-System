package Model;

import javax.swing.JTable;

public class BusService {
    private Bus head;
    private Bus tail;
    public int counter;
    
    public class Bus {
            private int busNumber;
            private String busName;
            private String fromStation;
            private String toStation;
            private int seatsAvailable;
            private double fare;
            private String doj;
            private Bus next;

                public Bus(int busNumber, String busName, String fromStation, String toStation, int seatsAvailable, double fare, String doj) {
                    this.busNumber = busNumber;
                    this.busName = busName;
                    this.fromStation = fromStation;
                    this.toStation = toStation;
                    this.seatsAvailable = seatsAvailable;
                    this.fare = fare;
                    this.doj = doj;
                    next = null;
                }

                public int getBusNumber() {
                    return busNumber;
                }

                public String getBusName() {
                    return busName;
                }

                public String getFromStation() {
                    return fromStation;
                }

                public String getToStation() {
                    return toStation;
                }

                public int getSeatsAvailable() {
                    return seatsAvailable;
                }

                public double getFare() {
                    return fare;
                }

                public String getDoj() {
                    return doj;
            }
        }
        
        public void insert(int busNumber, String busName, String fromStation, String toStation, int seatsAvailable, double fare, String doj){
            
            Bus new_bus=new Bus(busNumber,busName,fromStation,toStation,seatsAvailable,fare,doj);
            new_bus.next = null;
            
            if(isEmpty()){
                head=new_bus;
                tail=new_bus;
            }
            else{
               tail.next=new_bus;
               tail=new_bus;
            }
            counter++;
        }
        
        public boolean isEmpty(){
            if(head==null)
                return true;
            else
                return false;
        }
        
        boolean search(int busNumber) 
        { 
            Bus current = head; // Initialize current 
            while (current != null) 
            { 
                if (current.busNumber==busNumber)
                    return true;
                
                current = current.next;
            } 
            return false; 
        } 
        
        /*public void printList(BusService list)
        {
            Bus currNode = list.head;

            // Traverse through the LinkedList
            while (currNode != null) {
                // Print the data at current node
                System.out.print(currNode.busName + "\n");

                // Go to next node
                currNode = currNode.next;
            }
        }*/
        
        public Bus displaySearchedBus(int busNumber){
            Bus current = head; // Initialize current 
            while (current != null) 
            { 
                if (current.busNumber==busNumber)
                    return current;
                
                current = current.next; 
            }
            return null;
        }
        
        public void fillTable(JTable busTable){
            int j=0;
            Bus currNod=head;
                    for(int i=0; currNod!=null; i++){
                            busTable.setValueAt(currNod.getBusNumber(), i, j);
                            busTable.setValueAt(currNod.getBusName(), i, j+1);
                            busTable.setValueAt(currNod.getFromStation(), i, j+2);
                            busTable.setValueAt(currNod.getToStation(), i, j+3);
                            busTable.setValueAt(currNod.getSeatsAvailable(), i, j+4);
                            busTable.setValueAt(currNod.getFare(), i, j+5);
                            busTable.setValueAt(currNod.getDoj(), i, j+6);
                           
                        currNod=currNod.next;
                   }
        }
}


