package Views.AccountViews;

import Main.SharedResources;
import Views.UIView;

public class AccountLogoutNoView extends UIView {
    public AccountLogoutNoView() {
        this.myViewName = "View.LogOut.NoView";
    }
    @Override
    public ViewStatus showAndQuery() {

//        log out
        SharedResources.setCurrentUser(null);

        SharedResources.setJumpToView("Views.Main.MainView");
        return ViewStatus.JUMP_TO;
    }
}
