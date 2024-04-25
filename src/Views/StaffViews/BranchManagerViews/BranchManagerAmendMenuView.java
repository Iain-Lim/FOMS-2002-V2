package Views.StaffViews.BranchManagerViews;

import Views.MenuViews.MenuDisplayView;
import Views.UIMenuView;
import Views.UIView;

public class BranchManagerAmendMenuView extends UIMenuView {
    private int user_request;
    public BranchManagerAmendMenuView() {
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
                new BranchManagerEditMenuItemView(),
                new MenuDisplayView(true),
        };
    }
}
