package Backend;

import Database.DataStructs.MenuItem_T;
import Main.SharedResources;

import java.util.ArrayList;

public class Branch {
    private Staff[] myStaff;
    private ArrayList<MenuItem_T> branchMenu;

    public boolean addToMenu(MenuItem_T menuItemT) {
        return SharedResources.getMenuDBHelper().addToDatabase(menuItemT);
    }
}
