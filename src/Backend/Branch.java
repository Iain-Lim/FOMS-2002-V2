package Backend;

import Database.DataStructs.Branch_T;
import Database.DataStructs.MenuItem_T;
import Main.SharedResources;

import java.util.ArrayList;

public class Branch {
    private static Branch_T branchData;
    private Staff[] myStaff;
    private static ArrayList<MenuItem_T> branchMenu;

    public boolean addToMenu(MenuItem_T menuItemT) {
        boolean addedToMenu;
        addedToMenu = SharedResources.getMenuDBHelper().addToDatabase(menuItemT);
        if (addedToMenu) {
            return branchData.addMenuItem(menuItemT);
        }
        return false;
    }

    public static void printMenu() {
        branchData = SharedResources.getCurrentBranch();
        branchMenu = branchData.getMenuItems();
        for (int i = 0; i < branchMenu.size(); i++) {
            System.out.println( (i+1) + ": " + branchMenu.get(i).prettyPrint());
        }
    }
}
