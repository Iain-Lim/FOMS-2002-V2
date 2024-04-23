package Views.CustomerViews;

import Views.UIMenuView;
import Views.UIView;
import java.util.ArrayList;

// Check placed order status using order ID. 
public class CustomerPendingOrdersView extends UIMenuView {

    public CustomerPendingOrdersView() { 
        this.myViewName = "Views.CustomerViews.CustomerPendingOrdersView";
        this.subViews = new UIView[] {
            new CustomerDisplayOrder(),
        };
        this.myViewOptions = new String[] {
            "Enter OrderID",
        };
    }



}
