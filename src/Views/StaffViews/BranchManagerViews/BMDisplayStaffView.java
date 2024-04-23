package Views.StaffViews.BranchManagerViews;

import Database.DataStructs.Branch_T;
import Main.SharedResources;
import Views.UIView;

public class BMDisplayStaffView extends UIView {
    public BMDisplayStaffView() {
        this.myViewName = this.getClass().getCanonicalName();
    }

    @Override
    public ViewStatus showAndQuery() {
        return ViewStatus.OK;
    }
}
