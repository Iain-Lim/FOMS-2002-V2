package Database.DataStructs;

import java.util.ArrayList;
import java.util.UUID;

public class Branch_TI implements IDatabaseItem_T {
    private UUID branchId;
    public ArrayList<MenuItem_TI> menuItems;
    private String branchName;
    public Branch_TI() { }

    public Branch_TI(String branchName) {
        this.branchId = UUID.randomUUID();
        this.menuItems = new ArrayList<>();
        this.branchName = branchName;
    }

    public UUID getBranchId() {
        return branchId;
    }

    public void setBranchId(UUID branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public ArrayList<MenuItem_TI> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem_TI> menuItems) {
        this.menuItems = menuItems;
    }

    public boolean addMenuItem(MenuItem_TI menuItem) {
        this.menuItems.add(menuItem);
        return true;
    }

    @Override
    public String toString() {
        return "Branch_T{" +
                "branchId=" + branchId +
                ", menuItems=" + menuItems +
                ", branchName='" + branchName + '\'' +
                '}';
    }

    @Override
    public String prettyPrint() {
        return "Branch_T{" +
                ", branchName='" + branchName +
                ", menuItems=" + menuItems + '\'' +
                '}';
    }
}
