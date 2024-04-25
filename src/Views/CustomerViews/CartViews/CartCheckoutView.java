package Views.CustomerViews.CartViews;

import Database.DataStructs.OrderStatus;
import Database.DataStructs.Order_T;
import Main.SharedResources;
import Views.PaymentMethodViews.PaymentMethodDisplayAllView;
import Views.UIQueryView;

import java.util.Scanner;

import Backend.PaymentDynamic;

public class CartCheckoutView extends UIMenuWithExtraView {
    private int user_request;
    public CartCheckoutView() {
        this.myViewName = this.getClass().getCanonicalName();

        this.myViewOptions = new String[] {
            "Return",
        };
        this.subViews = new UIView[] {
            null,
        };
        

    }

    @Override
    public void show() {
        PaymentMethodDisplayAllView paymentMethodDisplayView = new PaymentMethodDisplayAllView();
        paymentMethodDisplayView.showAndQuery();
    }

    // @Override
    // public void query() {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Pay By: ");
    //     this.user_request = sc.nextInt();
    // }

    //     @Override
    //     public ViewStatus handleQuery() {
    // //        pay
    //         System.out.println("Success...");
    //         SharedResources.setJumpToView("Views.CustomerViews.CartViews.CartBaseView");

    // //        todo save the order, purge from cache

    //         return ViewStatus.JUMP_TO;
    //     }


    /* use backend class to dynamically list the payment options */
    @Override
    public void query() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pay By: ");
        this.user_request = sc.nextInt();
    }

    @Override
    public ViewStatus showAndQuery() {
        if (SharedResources.getCurrentCustomerOrder().isEmpty()) {
            System.out.println("Nothing to checkout");
            return ViewStatus.FAIL_AND_GO_BACK;
        }
        return super.showAndQuery();
    }

    @Override
    public ViewStatus handleQuery() {
//        pay
        System.out.println("Success...");
        String orderPrintable = SharedResources.getCurrentCustomerOrder().printReceipt();

        SharedResources.getCurrentCustomerOrder().setOrderStatus(OrderStatus.IN_PROGRESS);
        SharedResources.getCurrentCustomerOrder().setBranchId(
                SharedResources.getCurrentCustBranchT().getBranchUUID()
        );

        SharedResources.getCurrentCustomerOrder().addMeToDB();
        SharedResources.setCurrentCustomerOrder(new Order_T());

        System.out.println(orderPrintable);

        SharedResources.setJumpToView("Views.CustomerViews.CartViews.CartBaseView");

//        todo save the order, purge from cache

        return ViewStatus.JUMP_TO;
    }

}
