package Views.StaffViews.AdminViews;

import Database.DataStructs.Branch_T;
import Database.DataStructs.User_T;
import Main.SharedResources;
import Views.BranchViews.BranchDisplayAllView;
import Views.UIQueryView;
import Views.UIView;

import java.util.Scanner;

public class AdminCloseBranchView extends UIQueryView {
    private String branchName;
    private Branch_T branchPartialT;
    public AdminCloseBranchView() {
        this.myViewName = this.getClass().getCanonicalName();
    }


    @Override
    public void show() {
        UIView viewBranches = new BranchDisplayAllView();
        viewBranches.showAndQuery();
    }

    @Override
    public void query() {
        Scanner sc = new Scanner(System.in);

        System.out.print("branch: ");
        branchName = sc.nextLine();
    }

    @Override
    public ViewStatus handleQuery() {
        this.branchPartialT = new Branch_T(branchName);

        if (!this.branchPartialT.isInDB()) {
            System.out.println("branch not found!");
            return ViewStatus.FAIL_AND_GO_BACK;
        }

        int idx = SharedResources.getBranchDBHelper().idxInDatabase_branchName(branchPartialT, true);
        SharedResources.getUserDatabaseHelper().removeFromDatabase(idx);

        System.out.println("removed branch successful");
        return ViewStatus.SUCCESS_AND_GO_BACK;
    }
}
