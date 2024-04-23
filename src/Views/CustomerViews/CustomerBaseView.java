package Views.CustomerViews;

import Database.DataStructs.Branch_T;
import Views.UIMenuWithExtraView;
import Views.UIView;

public class CustomerBaseView extends UIMenuWithExtraView {
    private Branch_T currBranch;

    public CustomerBaseView() {
        myViewName = "Views.CustomerView";
        this.myViewOptions = new String[] {
                "Order New",
                "See Pending Orders"
        };
        this.subViews = new UIView[] {
                new CustomerOrderNewView(),
        };
    }
}
