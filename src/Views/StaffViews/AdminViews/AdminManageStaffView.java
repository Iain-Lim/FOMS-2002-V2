package Views.StaffViews.AdminViews;

import Views.AccountViews.AccountDisplayAllView;
import Views.UIMenuView;
import Views.UIView;

public class AdminManageStaffView extends UIMenuView {
    public AdminManageStaffView() {
        this.myViewName = this.getClass().getCanonicalName();
        this.myViewOptions = new String[] {
                "Change Staff Type",
                "Move Branch",
                "See All",
        };
        this.subViews = new UIView[] {
                new AdminChangeStaffTypeView(),
                null,
                new AccountDisplayAllView(),
        };
    }

//    todo list accounts and query

}
