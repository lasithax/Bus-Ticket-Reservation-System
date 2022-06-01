
package Model;

public class AddBusModel {
    public static BusService list=new BusService();
    
        public static void AddNewBus(int busNumber, String busName, String fromStation, String toStation, int seatsAvailable, double fare, String doj){
            list.insert(busNumber,busName,fromStation,toStation,seatsAvailable,fare,doj);
        }
}
