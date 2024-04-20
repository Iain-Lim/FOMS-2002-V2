package Database.DataStructs;

import java.util.ArrayList;
import java.util.UUID;

public class Branch_T implements java.io.Serializable {
    private UUID branchId;
    public ArrayList<MenuItem_T> menuItems;
    private String branchName;
    public Branch_T() { }

    public Branch_T(String branchName) {
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

    public ArrayList<MenuItem_T> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem_T> menuItems) {
        this.menuItems = menuItems;
    }

    public boolean addMenuItem(MenuItem_T menuItem) {
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
}
