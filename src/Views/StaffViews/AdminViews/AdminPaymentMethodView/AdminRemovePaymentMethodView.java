package Views.StaffViews.AdminViews.AdminPaymentMethodView;

import java.util.Scanner;

import Database.DataStructs.PaymentMethod_T;
import Database.DataStructs.PaymentType;
import Main.SharedResources;
import Views.UIQueryView;
import Views.UIView;
import Views.PaymentViews.PaymentMethodDisplayAllView;

public class AdminRemovePaymentMethodView extends UIQueryView{
    private PaymentMethod_T paymentMethod_T;
    private String paymentMethodName;
    private PaymentType paymentType;
    private int user_request;

    public AdminRemovePaymentMethodView() {
        this.myViewName = this.getClass().getCanonicalName();
    }

    @Override
    public void show() {
        UIView seeAllAccounts = new PaymentMethodDisplayAllView();
        seeAllAccounts.showAndQuery();
    }

    @Override
    public void query() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Remove: ");
        paymentMethodName = sc.nextLine();

        System.out.println("Payment Types:");
        System.out.println("1. " + PaymentType.CREDIT_CARD);
        System.out.println("2. " + PaymentType.DEBIT_CARD);
        System.out.println("3. " + PaymentType.QR);
        System.out.print("> ");
        this.user_request = sc.nextInt();
    }

    @Override
    public ViewStatus handleQuery() {

        switch (user_request) {
            case 1:
                paymentType = PaymentType.CREDIT_CARD;
                break;
            case 2:
                paymentType = PaymentType.DEBIT_CARD;
                break;
            
            case 3:
                paymentType = PaymentType.QR;
                break;
            
            default:
                System.out.println("Payment Type invalid!");
                return ViewStatus.FAIL_AND_GO_BACK;
        }
        this.paymentMethod_T = new PaymentMethod_T(paymentMethodName, paymentType);

        if (!this.paymentMethod_T.isInDB()) {
            System.out.println("Payment method with this type does not exist!");
            return ViewStatus.FAIL_AND_GO_BACK;
        }

        int idx = SharedResources.getPaymentMethodDBHelper().idxInDatabase_PaymentName_Type(paymentMethod_T, true);
        SharedResources.getPaymentMethodDBHelper().removeFromDatabase(idx);
        System.out.println("Payment method removed!");
        return ViewStatus.SUCCESS_AND_GO_BACK;
    }
}