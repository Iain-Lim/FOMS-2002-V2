package Views.AccountViews;

import Views.UIMenuView;
import Views.UIView;

public class AccountSettingsView extends UIMenuView {
    public AccountSettingsView() {
        this.myViewName = "View.AccountSettings";
        this.subViews = new UIView[] {
                new AccountLogoutNoView(),
                new AccountChangePasswordView(),
        };
        this.myViewOptions = new String[] {
                "Log Out",
                "Change Password"
        };
    }
}
