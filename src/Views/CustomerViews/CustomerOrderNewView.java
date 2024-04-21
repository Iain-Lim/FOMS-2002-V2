package Views.CustomerViews;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Views.UIMenuView;
import Views.UIView;
import Database.DatabaseHelper;
import Database.MenuDBHelper;
import Database.DataStructs.IDatabaseItem_T;
import Database.DataStructs.MenuItem_TI;
import Main.SharedResources;

public class CustomerOrderNewView extends UIMenuView {
    private Map<String, Integer> menuItems;
    private Map<String, Integer> orderDetails;
    
    public CustomerOrderNewView() {
        myViewName = "Views.CustomerViews.CustomerOrderView";
        
        MenuDBHelper menuDB = SharedResources.getMenuDBHelper();
        ArrayList<IDatabaseItem_T> databaseItems = menuDB.getAllFromDatabase();
        
        this.myViewOptions = new String[databaseItems.size()]; {

            for (int i = 0; i < databaseItems.size(); i++) {
                MenuItem_TI item = (MenuItem_TI) databaseItems.get(i);
                myViewOptions[i] = item.getName() + " - $" + item.getPrice();
            }

        };
        this.subViews = new UIView[] {
                
        };
        
    }
}


