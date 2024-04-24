package Views.AccountViews;

import Main.SharedResources;
import Views.UIView;

public class AccountLogoutNoView extends UIView {
    public AccountLogoutNoView() {
        this.myViewName = this.getClass().getCanonicalName();
    }
    @Override
    public ViewStatus showAndQuery() {

//        log out
        SharedResources.setCurrentUserT(null);

        SharedResources.setJumpToView("Views.Main.MainView");
        return ViewStatus.JUMP_TO;
    }
}
