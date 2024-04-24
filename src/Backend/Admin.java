package Backend;

import Database.DataStructs.StaffType;
import Database.DataStructs.User_T;
import Main.SharedResources;
import Views.AccountViews.AccountDisplayAllView;
import Views.CrudView;
import Views.StaffViews.AdminViews.AdminManageAccountsView;
import Views.StaffViews.AdminViews.AdminManageBranchView;
import Views.StaffViews.AdminViews.AdminManageStaffView;
import Views.StaffViews.AdminViews.AdminPaymentMethodView.AdminManagePaymentMethodsView;
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
                new AdminManageAccountsView(),
                new AdminManageStaffView(),
                new AdminManageBranchView(),
                new AdminManagePaymentMethodsView(),
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
        SharedResources.getUserDatabaseHelper().printAllInDatabase(true);
    }

    @Override
    public boolean promoteStaff(User_T userPartial, StaffType newStaffType) {
        int idx;
        idx = SharedResources.getUserDatabaseHelper().idxInDatabase_uuid(userPartial, true);
        if (idx == -1) return false;

        userPartial.setStaffType(newStaffType);
        SharedResources.getUserDatabaseHelper().updateDataInDatabase(idx, userPartial);
        return true;
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
