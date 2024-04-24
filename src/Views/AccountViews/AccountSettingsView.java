package Views.AccountViews;

import Views.UIMenuView;
import Views.UIView;

public class AccountSettingsView extends UIMenuView {
    public AccountSettingsView() {
        this.myViewName = this.getClass().getCanonicalName();
        this.subViews = new UIView[] {
                new AccountLogoutNoView(),
                new AccountChangePasswordView(),
                new AccountDisplayMyInfoView(),
        };
        this.myViewOptions = new String[] {
                "Log Out",
                "Change Password",
                "My Account Info"
        };
    }
}
