package Backend;

import Database.DataStructs.User_T;
import Views.StaffViews.NormalStaffViews.StaffDisplayOrdersView;
import Views.StaffViews.NormalStaffViews.StaffProcessOrdersView;
import Views.UIView;

public class NormalStaff extends Staff implements INormalStaff {
    protected User_T userObj;

    @Override
    public String[] getViewOptions() {
        return new String[] {
                "View New Orders",
                "Process Order",
                "View All Orders",
        };
    }

    @Override
    public UIView[] getSubViews() {
        return new UIView[] {
                new StaffDisplayOrdersView(true),
                new StaffProcessOrdersView(),
                new StaffDisplayOrdersView(false),
        };
    }

    @Override
    public void displayOrders(boolean onlyNew) {

    }

    @Override
    public void displayOrder() {

    }
}
