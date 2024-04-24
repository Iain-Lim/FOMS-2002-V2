package Views.StaffViews.NormalStaffViews;

import Backend.Branch;
import Backend.NormalStaff;
import Backend.Staff;
import Views.UIView;

public class StaffDisplayOrdersView extends UIView {
    NormalStaff normalStaff;
    Branch branch;

    boolean onlyShowNew;

    public StaffDisplayOrdersView() {
       this.myViewName = this.getClass().getCanonicalName();
       this.onlyShowNew = true;
    }

    public StaffDisplayOrdersView(boolean onlyShowNew) {
        this.myViewName = this.getClass().getCanonicalName();
        this.onlyShowNew = onlyShowNew;
    }

    @Override
    public void show() {
        System.out.println("Show Orders");
    }

    @Override
    public ViewStatus showAndQuery() {
        super.showAndQuery();
        return ViewStatus.OK;
    }
}
