package Views.CustomerViews;

import Database.DataStructs.Order_T;
import Database.OrderDBHelper;
import Main.SharedResources;
import Views.UIQueryView;

import java.util.Scanner;
import java.util.UUID;

public class CustomerViewPreviousOrderView extends UIQueryView {
    private boolean toPickup;
    private String orderId;

    public CustomerViewPreviousOrderView() {
       this.myViewName = this.getClass().getCanonicalName();
    }

    public CustomerViewPreviousOrderView(boolean toPickup) {
        this.myViewName = this.getClass().getCanonicalName();
        this.toPickup = toPickup;
    }

    @Override
    public void query() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Order Id: ");
        this.orderId = sc.nextLine();
    }

    @Override
    public ViewStatus handleQuery() {

        Order_T orderPartialT = new Order_T();
        orderPartialT.setOrderId(UUID.nameUUIDFromBytes(orderId.getBytes()));

        OrderDBHelper orderDBHelper = SharedResources.getOrderDBHelper();

        int itemIdxInDb;
        itemIdxInDb = orderDBHelper.idxInDatabase_orderId(orderPartialT);
        if (itemIdxInDb == -1) {
            System.out.println("Order does not exist!");
            return ViewStatus.FAIL_AND_GO_BACK;
        }

        Order_T orderT = (Order_T) orderDBHelper.getFromDatabase(itemIdxInDb);
        System.out.println(orderT.prettyPrint());

        return ViewStatus.SUCCESS_AND_GO_BACK;
    }
}
