package Control;

import Model.BusService.Bus;
import Model.SearchBusModel;
import javax.swing.JTable;

public class SearchBusControl {
        SearchBusModel obj=new SearchBusModel();
        
        public boolean searchBus(int busNumber){

                if(obj.searchBus(busNumber)){
                    return true;
                }
                return false;
        }

        public Bus displaySearchedBus(int busNumber){
            return obj.displaySearchedBus(busNumber);
        }
        
        public void fillTableData(JTable busTable){
            obj.fillTableData(busTable);
    }
}
