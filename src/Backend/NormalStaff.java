package Backend;

import Database.DataStructs.User_T;
import Views.UIView;

public class NormalStaff extends Staff implements INormalStaff {
    protected User_T userObj;

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
                null,
                null
        };
    }

    @Override
    public void displayOrders(boolean onlyNew) {

    }

    @Override
    public void displayOrder() {

    }
}
