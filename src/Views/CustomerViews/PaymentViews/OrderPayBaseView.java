package Views.CustomerViews.PaymentViews;

import Views.UIMenuView;
import Views.UIView;

import java.util.*;


public class OrderPayBaseView extends UIMenuView{

    public OrderPayBaseView(){

        this.myViewName = this.getClass().getCanonicalName();
        this.subViews = new UIView[] {
                new creditType(),                
                new debitType(),
                new QRType()
        };

        this.myViewOptions = new String[] {
                "Credit Card",
                "Debit Card",
                "QR Code"        
        };
    }



}
