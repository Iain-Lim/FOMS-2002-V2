package Views.CustomerViews.PaymentViews;

import Views.UIQueryView;
import Main.SharedResources;
import java.util.*;

/* Specific Payment Method */
public class QRTypeView extends UIQueryView {

    //private final paymentDBHelper;

    private int success;
    
    public QRTypeView() {
        this.myViewName = this.getClass().getCanonicalName();
        //paymentDBHelper = SharedResources.getPaymentDatabaseHelper();
    }

    @Override
    public void query() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---QR CODE PAYMENT---");

        System.out.println("Scan the QR Code");
        System.out.println("10101010101010101");
        System.out.println("01010010101010101");
        System.out.println("Press <Enter> when complete");

        sc.nextLine();
    }

    @Override
    public ViewStatus handleQuery() {
        if (true) {
            System.out.println("Payment Success!");
            return ViewStatus.SUCCESS_AND_GO_BACK;
        }

        System.out.println("Failed to make payment");
        return ViewStatus.FAIL_AND_GO_BACK;
    }

}
