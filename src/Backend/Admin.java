package Backend;

import Views.UIView;

public class Admin extends Staff implements IAdmin {

    @Override
    public String[] getViewOptions() {
        String[] myViewOptions = new String[] {
                "Manage Accounts",
                "Manage Staff",
                "Manage Branches",
                "Manage Payment Methods"
        };

        return myViewOptions;
    }

    @Override
    public UIView[] getSubViews() {
        UIView[] mySubViews = new UIView[] {
                null,
                null,
                null,
                null
        };

        return mySubViews;
    }
}
