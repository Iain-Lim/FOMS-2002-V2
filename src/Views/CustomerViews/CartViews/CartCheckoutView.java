package Views.CustomerViews.CartViews;

import Main.SharedResources;
import Views.PaymentMethodViews.PaymentMethodDisplayAllView;
import Views.UIQueryView;

import java.util.Scanner;

public class CartCheckoutView extends UIQueryView {
    private int user_request;
    public CartCheckoutView() {
        this.myViewName = this.getClass().getCanonicalName();
    }

    @Override
    public void show() {
        PaymentMethodDisplayAllView paymentMethodDisplayView = new PaymentMethodDisplayAllView();
        paymentMethodDisplayView.showAndQuery();
    }

    @Override
    public void query() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pay By: ");
        this.user_request = sc.nextInt();
    }

    @Override
    public ViewStatus handleQuery() {
//        pay
        System.out.println("Success...");
        SharedResources.setJumpToView("Views.CustomerViews.CartViews.CartBaseView");

//        todo save the order, purge from cache

        return ViewStatus.JUMP_TO;
    }
}
