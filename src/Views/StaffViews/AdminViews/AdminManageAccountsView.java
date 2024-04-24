package Views.StaffViews.AdminViews;

import Views.AccountViews.AccountDisplayAllView;
import Views.UIMenuView;
import Views.UIView;

public class AdminManageAccountsView extends UIMenuView {
    public AdminManageAccountsView() {
        this.myViewName = this.getClass().getCanonicalName();
        this.myViewOptions = new String[] {
                "Add",
                "Remove",
                "Change Username",
                "Reset Password",
                "See All",
        };
        this.subViews = new UIView[] {
                new AdminAddAccountView(),
                new AdminRemoveAccountView(),
                new AdminChangeAccountUsernameView(),
                new AdminResetAccountPasswordView(),
                new AccountDisplayAllView(),
        };
    }
}
