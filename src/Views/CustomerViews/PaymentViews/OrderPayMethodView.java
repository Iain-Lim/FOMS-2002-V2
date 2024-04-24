package Views.CustomerViews.PaymentViews;

import Views.UIQueryView;
import Views.UIView;

import java.util.*;
import Views.UIMenuView;
import Database.PaymentMethodDBHelper;
import Database.DataStructs.IDatabaseItem_T;
import Database.DataStructs.PaymentMethod_T;
import Database.DataStructs.PaymentType;
import Main.Main;
import Main.SharedResources;
import Views.CustomerViews.PaymentViews.*;

/* Query for name from given type. */
public class OrderPayMethodView extends UIQueryView{

    private final ArrayList<IDatabaseItem_T> paymentMethodArr;
    private final PaymentMethodDBHelper paymentMethodDBHelper;
    private PaymentMethod_T paymentMethod;
    private PaymentType paymentType;
    private int user_request;
    private int numPaymentMethod = 0;

    public OrderPayMethodView(PaymentType paymentType) {
        this.myViewName = this.getClass().getCanonicalName();
        this.paymentType = paymentType;
        SharedResources.setCurrentPaymentMethod(null);
        paymentMethodDBHelper = SharedResources.getPaymentMethodDBHelper();
        paymentMethodArr = paymentMethodDBHelper.getAllFromDatabase();
    }

    @Override
    public void show() {
        PaymentMethod_T tmpPaymentMethod;
        for (int i = 0; i < paymentMethodArr.size(); i++) {
            tmpPaymentMethod = (PaymentMethod_T) paymentMethodDBHelper.getFromDatabase(i);
            if(tmpPaymentMethod.getPaymentType() == paymentType){
                System.out.println( (numPaymentMethod+1) + ": " + tmpPaymentMethod.getPaymentName() );
                numPaymentMethod++;
            }
        }
    }

    @Override
    public void query() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Payment method: ");
        this.user_request = sc.nextInt();
    }

    @Override
    public ViewStatus handleQuery() {
        if ((this.user_request) < 1 || (this.user_request) > (this.paymentMethodArr.size()) ) {
            System.out.println("Failed to select payment method");
            return ViewStatus.FAIL_AND_GO_BACK;
        }

        // Query the DB to get the method again
        int count = 0;
        for (int i = 0; i < paymentMethodArr.size(); i++) {
            PaymentMethod_T tmpPaymentMethod = (PaymentMethod_T) paymentMethodDBHelper.getFromDatabase(i);
            if(tmpPaymentMethod.getPaymentType() == paymentType){
                count++;
                if (count == this.user_request)
                {
                    paymentMethod = tmpPaymentMethod;
                    SharedResources.setCurrentPaymentMethod(tmpPaymentMethod);
                    break;
                }
            }
        }

        //paymentMethod = (PaymentMethod_T) paymentMethodDBHelper.getFromDatabase(this.user_request - 1);
        //SharedResources.setCurrentPaymentMethod(paymentMethod);

        System.out.println("Chosen payment method and type: " +
                            paymentMethod.getPaymentName() + 
                            paymentMethod.getPaymentType());
        
        
        /* Check payment success */
        ViewStatus status;
        switch(paymentMethod.getPaymentType()){
            case PaymentType.CREDIT_CARD:
                status = new CreditType().showAndQuery();
                break;
            case PaymentType.DEBIT_CARD:
                status = new DebitType().showAndQuery();
                break;
            case PaymentType.QR:
                status = new QRType().showAndQuery();
                break;
            default:
                status = ViewStatus.ERROR;
                break;
        }

        /* Payment Success, print receipt() */
        if (status == ViewStatus.SUCCESS_AND_GO_BACK)
        {
            // TODO Print Receipt Class
            System.out.println("Chosen printing receipt: ");

            SharedResources.setJumpToView("Views.Main.MainView");
            return ViewStatus.JUMP_TO;
        }
        
        return ViewStatus.SUCCESS_AND_GO_BACK;
    }

}