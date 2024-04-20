package Database.DataStructs;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public class Order_T implements java.io.Serializable {
    private UUID orderId;
    private UUID branchId;
    private UUID customerId;
    private Timestamp ts;
    private ArrayList<MenuItem_T> menuItems;

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
}
