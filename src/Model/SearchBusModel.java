package Model;

import Model.BusService.Bus;
import javax.swing.JTable;

public class SearchBusModel {
    
    public boolean searchBus(int busNumber){
        if(AddBusModel.list.search(busNumber)){
            return true;
        }
        return false;
    }
    
    public Bus displaySearchedBus(int busNumber){
        return AddBusModel.list.displaySearchedBus(busNumber);
    }
    
    public void fillTableData(JTable busTable){
        AddBusModel.list.fillTable(busTable);
    }
}