package Database.DataStructs;

import Main.SharedResources;

import java.util.ArrayList;
import java.util.UUID;

public class Branch_T implements IDatabaseItem_T {
    private UUID branchUUID;
    public ArrayList<MenuItem_T> menuItems;
    public ArrayList<User_T> staffArr;

    private String branchName;
    public Branch_T() { }

    public Branch_T(String branchName) {
        this.branchUUID = UUID.randomUUID();
        this.menuItems = new ArrayList<>();
        this.staffArr = new ArrayList<>();
        this.branchName = branchName;
    }

    public UUID getBranchUUID() {
        return branchUUID;
    }

    public void setBranchUUID(UUID branchUUID) {
        this.branchUUID = branchUUID;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public ArrayList<MenuItem_T> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem_T> menuItems) {
        this.menuItems = menuItems;
    }

    public boolean addMenuItem(MenuItem_T menuItemT) {
        MenuItem_T copyMenuItemT = new MenuItem_T(menuItemT);
        copyMenuItemT.setBranchUUID(this.branchUUID);

        if (!this.hasThisMenuItem(copyMenuItemT)) {
            this.menuItems.add(copyMenuItemT);
            return true;
        }
        return false;
    }

    public boolean hasThisMenuItem(MenuItem_T menuItemPartialT) {
        MenuItem_T tempMenuItemT;

        for (int i = 0; i < this.menuItems.size(); i++) {
            tempMenuItemT = this.menuItems.get(i);

            if (
                    tempMenuItemT.getName().equals(menuItemPartialT.getName())
            ) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addMeToDB() {
        if (SharedResources.getBranchDBHelper().isInDatabase(this)) return false;

        MenuItem_T tempMenuItemT;
        for (int i = 0; i < menuItems.size(); i++) {
            tempMenuItemT = menuItems.get(i);
            tempMenuItemT.addMeToDB();
        }
        return SharedResources.getBranchDBHelper().addToDatabase(this);
    }

    public boolean isInDB() {
        return SharedResources.getBranchDBHelper().isInDatabase(this);
    }

    @Override
    public String toString() {
        return "Branch_T{" +
                "branchId=" + branchUUID +
                ", menuItems=" + menuItems +
                ", branchName='" + branchName + '\'' +
                '}';
    }

    @Override
    public String prettyPrint() {
        return this.getBranchName();
    }
}
