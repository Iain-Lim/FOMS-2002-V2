package Views.StaffViews.AdminViews;

import Views.AccountViews.AccountDisplayAllView;
import Views.AccountViews.AccountDisplayFilteredView;
import Views.UIMenuView;
import Views.UIView;

public class AdminManageStaffView extends UIMenuView {
    public AdminManageStaffView() {
        this.myViewName = this.getClass().getCanonicalName();
        this.myViewOptions = new String[] {
                "Change Staff Type",
                "Move Staff To Branch",
                "See All",
                "See All (Filtered)",
        };
        this.subViews = new UIView[] {
                new AdminChangeStaffTypeView(),
                new AdminMoveStaffView(),
                new AccountDisplayAllView(),
                new AccountDisplayFilteredView(),
        };
    }
}
