package Views.StaffViews.BranchManagerViews;

import Views.UIView;

public class BranchManagerDisplayStaffView extends UIView {
    public BranchManagerDisplayStaffView() {
        this.myViewName = this.getClass().getCanonicalName();
    }

    @Override
    public void show() {
        System.out.println("Display Staff in myBranch");
    }

    @Override
    public ViewStatus showAndQuery() {
        super.showAndQuery();
        return ViewStatus.OK;
    }
}
