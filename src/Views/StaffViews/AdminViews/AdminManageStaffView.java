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
                "Move Branch",
                "Display All",
                "Display All but filtered"
        };
        this.subViews = new UIView[] {
                new AdminChangeStaffTypeView(),
                new AdminMoveStaffView(),
                new AccountDisplayAllView(),
                new AccountDisplayFilteredView()
        };
    }

//    todo list accounts and query

}
