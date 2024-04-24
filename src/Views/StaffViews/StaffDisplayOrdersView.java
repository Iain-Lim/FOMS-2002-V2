package Views.StaffViews;

import Backend.Branch;
import Backend.NormalStaff;
import Backend.Staff;
import Views.UIView;

public class StaffDisplayOrdersView extends UIView {
    NormalStaff normalStaff;
    Branch branch;

    public StaffDisplayOrdersView() {
       this.myViewName = this.getClass().getCanonicalName();
    }

}
