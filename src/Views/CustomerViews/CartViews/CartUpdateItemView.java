package Views.CustomerViews.CartViews;

import Database.DataStructs.Order_T;
import Views.UIQueryView;
import Views.UIView;

import java.util.Scanner;

public class CartUpdateItemView extends UIQueryView {
    private int user_request;
    public CartUpdateItemView() {
        this.myViewName = this.getClass().getCanonicalName();
    }

    @Override
    public void show() {
        UIView cartView = new CartDisplayView();
        cartView.showAndQuery();
    }

    @Override
    public void query() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Update: ");
        this.user_request = sc.nextInt();
    }

    @Override
    public ViewStatus handleQuery() {
//      update cart

//        Order_T orderPartialT = new Order_T();
//        orderPartialT.setOrderId(UUID.nameUUIDFromBytes(orderId.getBytes()));
//
//        OrderDBHelper orderDBHelper = SharedResources.getOrderDBHelper();
//
//        int itemIdxInDb;
//        itemIdxInDb = orderDBHelper.idxInDatabase_orderId(orderPartialT);
//        if (itemIdxInDb == -1) {
//            System.out.println("Order does not exist!");
//            return ViewStatus.FAIL_AND_GO_BACK;
//        }
//
//        Order_T orderT = (Order_T) orderDBHelper.getFromDatabase(itemIdxInDb);
//        System.out.println(orderT.prettyPrint());
//
        return ViewStatus.SUCCESS_AND_GO_BACK;
    }
}
