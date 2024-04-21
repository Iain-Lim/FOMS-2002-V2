package Database.DataStructs;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.UUID;

/**
* dataStruct holding particulars associated to an Order
* Specifically, orderID, branchID, customerID, Timestamp and An ArrayList<MenuItem_TI> of menuItems
*/
public class Order_TI implements IDatabaseItem_T {
    private UUID orderId;
    private UUID branchId;
    private UUID customerId;
    private Timestamp ts;
    private ArrayList<MenuItem_TI> menuItems;

    public Order_TI() { }

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

    public ArrayList<MenuItem_TI> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem_TI> menuItems) {
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
}
