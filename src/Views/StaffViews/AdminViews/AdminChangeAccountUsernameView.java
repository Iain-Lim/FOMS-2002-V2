package Views.StaffViews.AdminViews;

import Database.DataStructs.User_T;
import Main.SharedResources;
import Views.AccountViews.AccountDisplayAllView;
import Views.UIQueryView;
import Views.UIView;

import java.util.Scanner;

public class AdminChangeAccountUsernameView extends UIQueryView {
    private String username;
    private String newUsername;
    private User_T userPartialT;
    public AdminChangeAccountUsernameView() {
        this.myViewName = this.getClass().getCanonicalName();
    }

    @Override
    public void show() {
        UIView seeAllAccounts = new AccountDisplayAllView();
        seeAllAccounts.showAndQuery();
    }

    @Override
    public void query() {
        Scanner sc = new Scanner(System.in);

        System.out.print("username: ");
        username = sc.nextLine();

        System.out.print("new username: ");
        newUsername = sc.nextLine();
    }

    @Override
    public ViewStatus handleQuery() {
        this.userPartialT = new User_T(username);

        if (!this.userPartialT.isInDB()) {
            System.out.println("username not found!");
            return ViewStatus.FAIL_AND_GO_BACK;
        }

        int idx = SharedResources.getUserDatabaseHelper().idxInDatabase_username(userPartialT, true);

        User_T tempUserT;
        tempUserT = (User_T) SharedResources.getUserDatabaseHelper().getFromDatabase(idx);
        tempUserT.setUsername(newUsername);

        SharedResources.getUserDatabaseHelper().updateDataInDatabase(idx, tempUserT);
        return ViewStatus.SUCCESS_AND_GO_BACK;
    }
}
