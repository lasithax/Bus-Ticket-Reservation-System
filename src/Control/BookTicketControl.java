package Control;

import Model.BookTicketModel;

public class BookTicketControl {
    public void bookTickets(int reference,int busNumber,int numberOfTickets){
        BookTicketModel obj=new BookTicketModel();
        obj.bookTickets(reference,busNumber,numberOfTickets);
    }
}
