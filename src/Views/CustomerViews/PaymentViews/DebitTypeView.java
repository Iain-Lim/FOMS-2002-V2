package Views.CustomerViews.PaymentViews;

import Views.UIQueryView;
import Main.SharedResources;
import java.util.*;

/* Specific Payment Type */
public class DebitTypeView extends UIQueryView {

    //private final paymentDBHelper;
    private int cardNumber;
    private int cvcCode;
    private int success;
    
    public DebitTypeView() {
        this.myViewName = this.getClass().getCanonicalName();
        //paymentDBHelper = SharedResources.getPaymentDatabaseHelper();
    }

    @Override
    public void query() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---DEBIT CARD PAYMENT---");

        System.out.println("cardNumber: ");
        cardNumber = Integer.parseInt(sc.nextLine());

        System.out.println("cvcCode: ");
        cvcCode = Integer.parseInt(sc.nextLine());

        System.out.println("Success? 1 for success: ");
        success = Integer.parseInt(sc.nextLine());
    }

    @Override
    public ViewStatus handleQuery() {

        //TODO print reciept


        if (success == 1) {
            System.out.println("Payment Success!");
            return ViewStatus.SUCCESS_AND_GO_BACK;
        }

        System.out.println("Failed to make payment");
        return ViewStatus.FAIL_AND_GO_BACK;
    }

}
