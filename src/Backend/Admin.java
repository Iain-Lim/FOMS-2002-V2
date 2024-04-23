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
                "Manage Payment Methods",
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

    @Override
    public boolean addStaff() {
        return false;
    }

    @Override
    public boolean editStaff() {
        return false;
    }

    @Override
    public boolean removeStaff() {
        return false;
    }

    @Override
    public void displayAllStaff() {

    }

    @Override
    public boolean promoteStaff() {
        return false;
    }

    @Override
    public boolean transferStaff() {
        return false;
    }

    @Override
    public boolean addPaymentMethod() {
        return false;
    }

    @Override
    public boolean removePaymentMethod() {
        return false;
    }

    @Override
    public boolean addBranch() {
        return false;
    }

    @Override
    public boolean removeBranch() {
        return false;
    }
}
