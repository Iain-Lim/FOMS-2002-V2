package Views.AccountViews;

import Main.SharedResources;
import Views.UIView;

public class AccountDisplayFilteredView extends UIView {
    public AccountDisplayFilteredView() {
        this.myViewName = this.getClass().getCanonicalName();
    }

    @Override
    public ViewStatus showAndQuery() {
        SharedResources.getUserDatabaseHelper().printAllInDatabase(true);

        return ViewStatus.OK;
    }
}
