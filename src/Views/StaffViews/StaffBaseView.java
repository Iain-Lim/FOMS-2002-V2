package Views.StaffViews;

import Backend.BranchManagerStaff;
import Backend.Staff;
import Database.DataStructs.StaffType;
import Database.DataStructs.User_T;
import Main.SharedResources;
import Views.AccountViews.AccountSettingsView;
import Views.AccountViews.AccountLoginAsStaffView;
import Views.UIMenuWithExtraView;
import Views.UIQueryView;
import Views.UIView;

public class StaffBaseView extends UIMenuWithExtraView {
    private User_T currUser;
    private Staff staffObj;

    public StaffBaseView() {
        myViewName = "Views.StaffViews.StaffBaseView";
        this.subViews = new UIView[] {
                new AccountSettingsView()
        };
        this.myViewOptions = new String[] {
                "My Account Settings",
        };
    }

    @Override
    public void show() {
        System.out.println();
        currUser.printUser();
        super.show();
    }

    @Override
    public ViewStatus showAndQuery() {
        currUser = SharedResources.getCurrentUser();

        if (currUser == null ||
                currUser.getStaffType() == StaffType.NORMAL_STAFF ||
                currUser.getStaffType() == StaffType.NA
        ) {
            ViewStatus viewStatus;

            UIQueryView login = new AccountLoginAsStaffView();
            viewStatus = login.showAndQuery();

            if (viewStatus == ViewStatus.SUCCESS_AND_GO_BACK) {
                System.out.println("Logged in successfully");
                currUser = SharedResources.getCurrentUser();

            } else if (viewStatus == ViewStatus.FAIL_AND_GO_BACK) {
//                failed to log in
                System.out.println("Failed to log in");
                return ViewStatus.FAIL_AND_GO_BACK;
            }
        }

        this.staffObj = SharedResources.getCurrStaff();

        if (this.staffObj != null) {
            this.myExtraViewOptions = this.staffObj.getViewOptions();
            this.myExtraSubViews = this.staffObj.getSubViews();
        }

//        continue as staff
        super.showAndQuery();

        return ViewStatus.SUCCESS_AND_GO_BACK;
    }
}
