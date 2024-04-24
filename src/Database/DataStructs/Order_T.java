package Database.DataStructs;

import Main.SharedResources;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.UUID;

public class Order_T implements IDatabaseItem_T {
    private UUID orderId;
    private UUID branchId;
    private UUID customerId;
    private Timestamp ts;
    private ArrayList<MenuItem_T> menuItems;
    private ArrayList<Integer> menuItemsQuantity;

    public Order_T() { }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public UUID getBranchId() {
        return branchId;
    }

    public void setBranchId(UUID branchId) {
        this.branchId = branchId;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public Timestamp getTs() {
        return ts;
    }

    public void setTs(Timestamp ts) {
        this.ts = ts;
    }

    public ArrayList<MenuItem_T> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem_T> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public String toString() {
        return "Order_T{" +
                "orderId=" + orderId +
                ", branchId=" + branchId +
                ", customerId=" + customerId +
                ", ts=" + ts +
                ", menuItems=" + menuItems +
                '}';
    }

    @Override
    public String prettyPrint() {
        return this.toString();
    }

    @Override
    public boolean addMeToDB() {
        return SharedResources.getOrderDBHelper().addToDatabase(this);
    }
}
