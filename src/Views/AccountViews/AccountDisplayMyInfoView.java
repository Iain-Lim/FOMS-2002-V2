package Views.AccountViews;

import Main.SharedResources;
import Views.UIView;

public class AccountDisplayMyInfoView extends UIView {
    public AccountDisplayMyInfoView() {
        this.myViewName = this.getClass().getCanonicalName();
    }

    @Override
    public ViewStatus showAndQuery() {
        System.out.println(SharedResources.getCurrentUserT().toString());
        return ViewStatus.OK;
    }
}
