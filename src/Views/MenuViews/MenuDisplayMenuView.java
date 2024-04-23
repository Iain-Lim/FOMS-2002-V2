package Views.MenuViews;

import Backend.Branch;
import Database.DataStructs.Branch_T;
import Main.SharedResources;
import Views.UIView;

public class MenuDisplayMenuView extends UIView {

    private Branch branch;

    public MenuDisplayMenuView() {
        this.myViewName = this.getClass().getCanonicalName();
        branch = SharedResources.getCurrentBeBranch();
    }

    @Override
    public void show() {
        branch = SharedResources.getCurrentBeBranch();
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
