package Views.AccountViews;

import Database.DataStructs.StaffType;
import Database.DataStructs.User_T;
import Main.SharedResources;
import Views.UIQueryView;

import java.util.Scanner;

public class AccountChangePasswordView extends UIQueryView {
    private User_T currUser;
    private String newPassword;
    private String oldPassword;

    public AccountChangePasswordView() {
        myViewName = "Views.ModifyUserView";
        currUser = SharedResources.getCurrentUser();
    }

    @Override
    public void query() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Current Password: ");
        oldPassword = sc.nextLine();

        System.out.print("New Password: ");
        newPassword = sc.nextLine();
    }

    @Override
    public ViewStatus handleQuery() {
        if (oldPassword.equals(newPassword)) {
            System.out.println("New password cannot be same as current!");
            return ViewStatus.FAIL_AND_GO_BACK;
        }

        currUser = SharedResources.getCurrentUser();

//        not logged in
        if (currUser == null || currUser.getStaffType() == StaffType.NA) {
            SharedResources.setErrorMessage("Change Password without being logged in");
            return ViewStatus.ERROR;
        }

        User_T userPartial = new User_T(currUser.getUsername(), oldPassword);

        if (!currUser.verifyPassword(userPartial)) {
            System.out.println("Current Password incorrect...");
            return ViewStatus.FAIL_AND_GO_BACK;
        }

        userPartial.setPassword(newPassword);

        System.out.println("Password successfully changed, please log in again...");
        SharedResources.getUserDatabaseHelper().updateUserPassword(userPartial);
        SharedResources.setCurrentUser(null);

        SharedResources.setJumpToView("Views.Main.MainView");
        return ViewStatus.JUMP_TO;
    }
}
