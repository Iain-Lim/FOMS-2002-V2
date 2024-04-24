package Backend;

import java.util.ArrayList;

import Database.PaymentMethodDBHelper;
import Database.DataStructs.IDatabaseItem_T;
import Database.DataStructs.PaymentMethod_T;
import Database.DataStructs.PaymentType;
import Main.SharedResources;
import Views.IBackendView;
import Views.UIView;

import Views.CustomerViews.PaymentViews.*;

public class PaymentDynamic implements IBackendView {
    ArrayList<IDatabaseItem_T> databaseObject;
    ArrayList<String> stringArr;
    ArrayList<UIView> objectArr;

    public PaymentDynamic(){
        PaymentMethodDBHelper paymentDB = SharedResources.getPaymentMethodDBHelper();
        UIView[] uiViews;
        String[] viewOptions;
        stringArr = new ArrayList<String>();
        objectArr = new ArrayList<UIView>();

        /* Populate dynamic view and view options */
        databaseObject = paymentDB.getAllFromDatabase();

        // Iterate database arrayList
        PaymentMethod_T paymentTemp;
        for (int i = 0; i < this.databaseObject.size(); i++) {
            paymentTemp = (PaymentMethod_T) this.databaseObject.get(i);
            
            String str = paymentTemp.getPaymentName();
            PaymentType type = paymentTemp.getPaymentType();

            // Extract Name + Type
            str = str.concat(" " + type.toString());
            stringArr.add(str);

            // Extract Type
            switch (type){
                case PaymentType.CREDIT_CARD:
                    objectArr.add(new CreditTypeView());
                    break;
                case PaymentType.DEBIT_CARD:
                    objectArr.add(new DebitTypeView());
                    break;
                case PaymentType.QR:
                    objectArr.add(new QRTypeView());
                    break;
                case PaymentType.OTHERS:
                    objectArr.add(new CreditTypeView());
                    break;
            }

        }


    }

    @Override
    public UIView[] getSubViews() {
        // Downcast ArrayList of <Object> to UIView[]
        UIView[] stockArr = new UIView[objectArr.size()];
        stockArr = objectArr.toArray(stockArr);


        return stockArr;
    }

    @Override
    public String[] getViewOptions() {
        // Downcast ArrayList of <Object> to String[]
        String[] stockArr = new String[stringArr.size()];
        stockArr = stringArr.toArray(stockArr);

        // for(int i=0 ; i<stockArr.length; i++)
        // {
        //     System.out.println(stockArr[i]);
        // }

        return stockArr;
    }

    
    
}
