package Views.CustomerViews.CartViews;

import Database.DataStructs.Order_T;
import Main.SharedResources;
import Views.UIView;


public class CartDisplayView extends UIView {

    public CartDisplayView() {
        this.myViewName = this.getClass().getCanonicalName();
    }

    @Override
    public ViewStatus showAndQuery() {
        System.out.println("Cart: ");
        Order_T orderT = SharedResources.getCurrentCustomerOrder();
        String orderPrintable = orderT.printOrder();
        System.out.println(orderPrintable);

        return ViewStatus.OK;
    }
}
