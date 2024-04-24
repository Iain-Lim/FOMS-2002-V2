package Views.CustomerViews.PaymentViews;

import Backend.Admin;
import Backend.BranchManagerStaff;
import Backend.NormalStaff;
import Backend.Staff;
import Database.DataStructs.IDatabaseItem_T;
import Database.DataStructs.PaymentMethod_T;
import Database.DataStructs.User_T;
import Database.PaymentMethodDBHelper;
import Database.UserDBHelper;
import Main.SharedResources;
import Views.UIQueryView;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderPayProcessView extends UIQueryView {
    private PaymentMethod_T paymentMethod_T;
    private final PaymentMethodDBHelper paymentMethodDBHelper;

    public OrderPayProcessView() {
       this.myViewName = this.getClass().getCanonicalName();
       paymentMethodDBHelper = SharedResources.getPaymentMethodDBHelper();
    }

    @Override
    public void query() {
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Select Payment Method: ");
        // username = sc.nextLine();


    }

    @Override
    public ViewStatus handleQuery() {

        // ArrayList<IDatabaseItem_T> paymentDB = paymentMethodDBHelper.getAllFromDatabase();
        // for (int i=0; i<paymentDB.size(); i++){
        //     PaymentMethod_T temp = (PaymentMethod_T) paymentDB.get(i);
        //     if (temp.)
        // }

        paymentMethod_T = SharedResources.getCurrentPaymentMethod();
        PaymentType type = paymentMethod_T.getPaymentType();
        case ()

        

        if (userVerified != null) {
            SharedResources.setCurrentUser(userVerified);
            setStaffObj();

            System.out.println("Logged in successfully");
            return ViewStatus.SUCCESS_AND_GO_BACK;
        }

        System.out.println("Failed to log in");
        return ViewStatus.FAIL_AND_GO_BACK;
    }

}
