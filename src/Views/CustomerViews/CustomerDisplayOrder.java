package Views.CustomerViews;

import Views.UIQueryView;
import Database.OrderDBHelper;
import Database.DataStructs.Branch_T;
import Database.DataStructs.IDatabaseItem_T;
import Database.DataStructs.Order_T;
import Main.SharedResources;
import java.util.Scanner;
import java.util.UUID;
import java.util.ArrayList;
import Database.DataStructs.MenuItem_T;

// check placed order status using order ID. 
public class CustomerDisplayOrder extends UIQueryView {
    // private Branch_TI chosenBranch;
    private Order_T order;
    private UUID customerOrderID;
    private final OrderDBHelper orderDBHelper;

    public CustomerDisplayOrder() {
        myViewName = "Views.AccountViews.LoginAsStaffView";
        orderDBHelper = SharedResources.getOrderDBHelper();
    }

    // user enters orderID
    @Override
    public void query() {
        Scanner sc = new Scanner(System.in);

        //TODO input validation
        System.out.print("Enter OrderID: ");
        customerOrderID = UUID.fromString(sc.nextLine());
    }

    @Override
    public ViewStatus handleQuery() {

        //TODO input validation
        //TODO implement search database functions
        //TODO Subfunctions like displaying an order should be somewhere else

        int orderFound = 0;
        
        try{
            // Iterate Database
            ArrayList<IDatabaseItem_T> orderDatabase = orderDBHelper.getAllFromDatabase();
            for (int i=0; i<orderDatabase.size(); i++){
                // Search for order
                order = (Order_T) orderDatabase.get(i);
                if (order.getOrderId() == customerOrderID)
                {
                    // Order found, display order
                    ArrayList<MenuItem_T> menuItemList = order.getMenuItems();
                    
                    System.out.println("OrderID: " + order.getOrderId());
                    System.out.println("Total Items: " + menuItemList.size());

                    for (int j=0; j<menuItemList.size(); j++){
                        // For each menuitem, print!
                        MenuItem_T menuItem = menuItemList.get(j);
                        System.out.println((j+1) + " " + menuItem.getName());
                    }

                    orderFound = 1;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }


        if (orderFound == 1) {
            return ViewStatus.SUCCESS_AND_GO_BACK;
        }
        return ViewStatus.FAIL_AND_GO_BACK;
    }
}
