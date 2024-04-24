package Views.CustomerViews.PaymentViews;

import Views.UIMenuView;
import Views.UIView;

import java.util.*;

import Database.DataStructs.PaymentType;


public class OrderPayBaseView extends UIMenuView{

    public OrderPayBaseView(){

        this.myViewName = this.getClass().getCanonicalName();
        this.subViews = new UIView[] {
                new creditType(),                
                new debitType(),
                new QRType(PaymentType.CREDIT_CARD)
        };

        this.myViewOptions = new String[] {
                "Credit Card",
                "Debit Card",
                "QR Code"        
        };
    }



}
