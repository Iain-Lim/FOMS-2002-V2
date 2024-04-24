package Views.MenuViews;

import Backend.Branch;
import Main.SharedResources;
import Views.UIView;

public class MenuDisplayView extends UIView {

    private Branch branch;

    public MenuDisplayView() {
        this.myViewName = this.getClass().getCanonicalName();
        branch = SharedResources.getCurrentBranchB();
    }

    @Override
    public void show() {
        branch = SharedResources.getCurrentBranchB();
        if (branch != null) {
            this.branch.printMenu();
        }
    }

    @Override
    public ViewStatus showAndQuery() {
        this.show();
        return ViewStatus.OK;
    }
}
