package Views.CustomerViews;

import Views.UIMenuView;
import Views.UIView;

public class CustomerOrderNewView extends UIMenuView {
    public CustomerOrderNewView() {
        myViewName = "Views.CustomerViews.CustomerOrderView";
        this.myViewOptions = new String[] {
                "Order"
        };
        this.subViews = new UIView[] {
                null
        };
    }
}
