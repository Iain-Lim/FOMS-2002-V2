package Views.StaffViews.BranchManagerViews;

import Views.BranchViews.BranchDisplayAllView;
import Views.MenuViews.MenuDisplayView;
import Views.UIMenuView;
import Views.UIView;

public class BranchManagerEditMenuView extends UIMenuView {
    private int user_request;
    public BranchManagerEditMenuView() {
        this.myViewName = this.getClass().getCanonicalName();
        this.myViewOptions = new String[] {
                "Add",
                "Remove",
                "Edit",
                "See All",
        };
        this.subViews = new UIView[] {
                new BranchManagerAddMenuItemView(),
                new BranchManagerRemoveMenuItemView(),
                null,
                new MenuDisplayView(true),
        };
    }
}
