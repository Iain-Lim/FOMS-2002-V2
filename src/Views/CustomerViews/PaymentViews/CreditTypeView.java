package Views.CustomerViews.PaymentViews;

import Views.UIQueryView;
import Main.SharedResources;
import java.util.*;

import Database.PaymentMethodDBHelper;
import Database.DataStructs.*;

/* Specific Payment Type */
public class CreditTypeView extends UIQueryView {

    private final PaymentMethodDBHelper DBHelper;
    private int cardNumber;
    private int cvcCode;
    private int success;
    
    public CreditTypeView() {
        this.myViewName = this.getClass().getCanonicalName();
        DBHelper = SharedResources.getPaymentMethodDBHelper();
    }

    @Override
    public void query() {
        Scanner sc = new Scanner(System.in);

        ArrayList<IDatabaseItem_T> paymentArray = DBHelper.getAllFromDatabase();
        for (int i=0; i<paymentArray.size(); i++){
            PaymentMethod_T temp = (PaymentMethod_T) paymentArray.get(i);
            if (temp.getPaymentType() == PaymentType.CREDIT_CARD){

            }
        }

        System.out.println("---CREDIT CARD PAYMENT---");

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
            
            SharedResources.setJumpToView("Views.Main.MainView");
            return ViewStatus.JUMP_TO;

        }else{
            System.out.println("Failed to make payment");
            return ViewStatus.FAIL_AND_GO_BACK;
        }
    }

    // @Override 
    // public ViewStatus showAndQuery()
    // {
    //     super.showAndQuery();
    //          //TODO print reciept

    //         if (success == 1) {
    //             System.out.println("Payment Success!");
                
    //             SharedResources.setJumpToView("Views.Main.MainView");
    //             return ViewStatus.JUMP_TO;
    //         }

    //         System.out.println("Failed to make payment");
    //         return ViewStatus.FAIL_AND_GO_BACK;
    // }

}
