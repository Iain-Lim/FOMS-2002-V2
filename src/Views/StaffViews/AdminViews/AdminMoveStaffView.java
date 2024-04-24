package Views.StaffViews.AdminViews;

import Database.DataStructs.Branch_T;
import Database.DataStructs.User_T;
import Main.SharedResources;
import Views.AccountViews.AccountDisplayAllView;
import Views.BranchViews.BranchDisplayAllView;
import Views.UIQueryView;
import Views.UIView;

import java.util.Scanner;

public class AdminMoveStaffView extends UIQueryView {
    private String username;
    private String branchName;
    private User_T userPartialT;
    private Branch_T branchPartialT;


    public AdminMoveStaffView() {
        this.myViewName = this.getClass().getCanonicalName();
    }

    @Override
    public void query() {
        UIView seeAllAccounts = new AccountDisplayAllView();
        seeAllAccounts.showAndQuery();

        Scanner sc = new Scanner(System.in);

        System.out.print("username: ");
        username = sc.nextLine();

        UIView seeAllBranches = new BranchDisplayAllView();
        seeAllBranches.showAndQuery();

        System.out.print("branch: ");
        branchName = sc.nextLine();
    }

    @Override
    public ViewStatus handleQuery() {

        this.userPartialT = new User_T(username);
        if (!this.userPartialT.isInDB()) {
            System.out.println("username not found!");
            return ViewStatus.FAIL_AND_GO_BACK;
        }

        this.branchPartialT = new Branch_T(branchName);
        if (!this.branchPartialT.isInDB()) {
            System.out.println("branch not found!");
            return ViewStatus.FAIL_AND_GO_BACK;
        }
        int userIdx = SharedResources.getUserDatabaseHelper().idxInDatabase_username(userPartialT, true);
        int branchIdx = SharedResources.getBranchDBHelper().idxInDatabase_branchName(branchPartialT, true);

        Branch_T tmpbranchT = (Branch_T) SharedResources.getBranchDBHelper().getFromDatabase(branchIdx);
        User_T tmpUserT = (User_T) SharedResources.getUserDatabaseHelper().getFromDatabase(userIdx);

//        todo, cpy branch to staff
//        todo, cpy staff to branch

        return ViewStatus.SUCCESS_AND_GO_BACK;
    }
}
