package Views.CustomerViews.CartViews;

import Main.SharedResources;
import Views.UIQueryView;
import Views.UIView;
import Views.UIMenuWithExtraView;

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
        System.out.println("Payment Methods... ");
        super.show();
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
    public ViewStatus showAndQuery() {

        // Call class to generate list of payment options
        PaymentDynamic PaymentMethods;
        PaymentMethods = new PaymentDynamic();

        if (true) {
            this.myExtraViewOptions = PaymentMethods.getViewOptions();
            this.myExtraSubViews = PaymentMethods.getSubViews();
        }

        // ViewStatus viewStatus;

        // Continue display
        return super.showAndQuery();

        //return ViewStatus.SUCCESS_AND_GO_BACK;
    }

}
