package Views.AccountViews;

import Main.SharedResources;
import Views.UIView;

public class AccountDisplayAllView extends UIView {
    public AccountDisplayAllView() {
        this.myViewName = this.getClass().getCanonicalName();
    }

    @Override
    public ViewStatus showAndQuery() {
        SharedResources.getUserDatabaseHelper().printAllInDatabase(true);

        return ViewStatus.OK;
    }
}
