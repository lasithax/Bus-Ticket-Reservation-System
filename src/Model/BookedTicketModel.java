package Model;

import static Model.BookTicketModel.ticketList;
import javax.swing.JTable;

public class BookedTicketModel {
    
    public void fillTableData(JTable ticketTable){
        
        BookTicketModel.ticketList.fillTable(ticketTable);
        
    }
    
    public boolean contains(int busNumber){
        if(ticketList.contains(busNumber)){
                    return true;
                }
                return false;
    }
    
    public TicketService.Ticket displaySearchedTicket(int busNumber){
            return ticketList.displaySearchedTicket(busNumber);
    }
}
