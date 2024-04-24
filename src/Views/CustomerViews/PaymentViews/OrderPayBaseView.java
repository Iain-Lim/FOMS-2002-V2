package Views.CustomerViews.PaymentViews;

import Views.UIMenuView;
import Views.UIView;

import java.util.*;

import Database.DataStructs.PaymentType;


public class OrderPayBaseView extends UIMenuView{

    public OrderPayBaseView(){

        this.myViewName = this.getClass().getCanonicalName();
        this.subViews = new UIView[] {
                new OrderPayMethodView(PaymentType.CREDIT_CARD),                
                new OrderPayMethodView(PaymentType.DEBIT_CARD),
                new OrderPayMethodView(PaymentType.QR)
        };

        this.myViewOptions = new String[] {
                "Credit Card",
                "Debit Card",
                "QR Code"        
        };
    }



}
