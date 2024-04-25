package Database.DataStructs;

import Main.SharedResources;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.UUID;

public class Order_T implements IDatabaseItem_T {
    private boolean isTakeaway;
    private UUID orderId;
    private UUID branchId;
    private UUID customerId;
    private Timestamp ts;
    private ArrayList<MenuItem_T> menuItems;
    private ArrayList<Integer> menuItemsQuantity;
    private OrderStatus orderStatus;

    public boolean isEmpty() {
        return (this.menuItems.isEmpty());
    }

    public Order_T() {
        this.orderId = UUID.randomUUID();
        this.ts = new Timestamp(System.currentTimeMillis());
        this.menuItems = new ArrayList<>();
        this.menuItemsQuantity = new ArrayList<>();
    }

    public boolean addItemToOrder(MenuItem_T menuItemT, int quantity) {

        MenuItem_T itemTemp;
        for (int i = 0; i < this.menuItems.size(); i++) {
            itemTemp = (MenuItem_T) this.menuItems.get(i);
            if (menuItemT.getMenuItemUUID().equals(itemTemp.getMenuItemUUID())) {
                System.out.println("item already in cart");
                return false;
            }
        }

        this.menuItems.add(menuItemT);
        this.menuItemsQuantity.add(quantity);

        return true;
    }

    public ArrayList<Integer> getMenuItemsQuantity() {
        return menuItemsQuantity;
    }

    public void setMenuItemsQuantity(ArrayList<Integer> menuItemsQuantity) {
        this.menuItemsQuantity = menuItemsQuantity;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

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
                "isTakeaway=" + isTakeaway +
                ", orderId=" + orderId +
                ", branchId=" + branchId +
                ", customerId=" + customerId +
                ", ts=" + ts +
                ", menuItems=" + menuItems +
                ", menuItemsQuantity=" + menuItemsQuantity +
                ", orderStatus=" + orderStatus +
                '}';
    }

    @Override
    public String prettyPrint() {
        return this.toString();
    }

    public String printReceipt() {
        String ret = "";
        if (menuItems.size() < 1) {
            ret += "Your Cart Is Empty...";
            return ret;
        }

        ret += "Order ID: " + this.orderId.toString() + "\n";
        if (this.isTakeaway) {
            ret += "=> Takeaway \n";
        } else {
            ret += "=> Dine In \n";
        }

        for (int i = 0; i < menuItems.size(); i++) {
            ret += (
                    (i+1) +
                            ": " + menuItems.get(i).getName() +
                            "\t -> " + menuItemsQuantity.get(i) +
                            " * $" + menuItems.get(i).getPrice() +
                            "\n"
            );
        }
        return ret;
    }

    public boolean isTakeaway() {
        return isTakeaway;
    }

    public void setTakeaway(boolean takeaway) {
        isTakeaway = takeaway;
    }

    public String printOrder() {
        String ret = "";
        for (int i = 0; i < menuItems.size(); i++) {
            ret += (
                (i+1) +
                ": " + menuItems.get(i).getName() +
                "\t -> " + menuItemsQuantity.get(i) +
                " * $" + menuItems.get(i).getPrice() +
                "\n"
            );
        }

        if (menuItems.size() < 1) {
            ret += "Your Cart Is Empty...";
        }

        return ret;
    }

    @Override
    public boolean addMeToDB() {
        return SharedResources.getOrderDBHelper().addToDatabase(this);
    }
}
