package Views.StaffViews.AdminViews;

import Views.BranchViews.BranchDisplayAllView;
import Views.UIMenuView;
import Views.UIView;

public class AdminManageBranchView extends UIMenuView {
    public AdminManageBranchView() {
        this.myViewName = this.getClass().getCanonicalName();
        this.myViewOptions = new String[] {
                "Open",
                "Close",
                "See All"
        };
        this.subViews = new UIView[] {
                new AdminOpenBranchView(),
                new AdminCloseBranchView(),
                new BranchDisplayAllView()
        };
    }
}
