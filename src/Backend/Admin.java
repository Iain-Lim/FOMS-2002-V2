package Backend;

import Views.AccountViews.AccountDisplayAllView;
import Views.UIView;

public class Admin extends Staff implements IAdmin {

    @Override
    public String[] getViewOptions() {
        return new String[] {
                "Manage Accounts",
                "Manage Staff",
                "Manage Branches",
                "Manage Payment Methods"
        };
    }

    @Override
    public UIView[] getSubViews() {
        return new UIView[] {
                new AccountDisplayAllView(),
                new AccountDisplayAllView(),
                new AccountDisplayAllView(),
                new AccountDisplayAllView()
        };
    }
}
