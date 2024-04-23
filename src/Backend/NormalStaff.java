package Backend;

import Views.UIView;
import Views.StaffViews.StaffDisplayOrdersView;
import Views.StaffViews.StaffProcessOrdersView;

public class NormalStaff extends Staff implements INormalStaff {
    @Override
    public String[] getViewOptions() {
        return new String[] {
                "View Orders",
                "Process Order"
        };
    }

    @Override
    public UIView[] getSubViews() {
        return new UIView[] {
                new StaffDisplayOrdersView(),
                new StaffProcessOrdersView()
        };
    }
}
