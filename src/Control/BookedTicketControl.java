package Control;

import Model.BookedTicketModel;
import Model.TicketService.Ticket;
import javax.swing.JTable;

public class BookedTicketControl {
    
    BookedTicketModel obj=new BookedTicketModel();
    
    public void fillTableData(JTable ticketTable){
        obj.fillTableData(ticketTable);
    }
    
    public boolean contains(int busNumber){
        if(obj.contains(busNumber)){
                    return true;
                }
                return false;
    }
    
    public Ticket displaySearchedTicket(int busNumber){
            return obj.displaySearchedTicket(busNumber);
        }
}
