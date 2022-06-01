/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.AddBusModel;

public class AddBusControl {
    
    public void addNewBus(int busNumber, String busName, String fromStation, String toStation, int seatsAvailable, double fare, String doj){
        AddBusModel newBus=new AddBusModel();
        newBus.AddNewBus(busNumber,busName,fromStation,toStation,seatsAvailable,fare,doj);
    }
}
