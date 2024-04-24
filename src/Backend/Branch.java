package Backend;

import Database.DataStructs.Branch_T;
import Database.DataStructs.MenuItem_T;
import Main.SharedResources;

import java.util.ArrayList;

public class Branch {
    private Branch_T branchT;
    private Staff[] myStaff;
    private ArrayList<MenuItem_T> branchMenu;

    public Branch(Branch_T branchT) {
        this.branchT = branchT;
    }

//    public boolean addToMenu(MenuItem_T menuItemT) {
//        boolean addedToMenu;
//        addedToMenu = SharedResources.getMenuDBHelper().addToDatabase(menuItemT);
//        if (addedToMenu) {
//            return branchT.addMenuItem(menuItemT);
//        }
//        return false;
//    }

    public void printMenu() {
        branchT = SharedResources.getCurrentBranchT();
        branchMenu = branchT.getMenuItems();
        for (int i = 0; i < branchMenu.size(); i++) {
            System.out.println( (i+1) + ": " + branchMenu.get(i).prettyPrint());
        }
    }
}
