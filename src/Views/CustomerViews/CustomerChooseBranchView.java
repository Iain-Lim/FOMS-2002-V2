package Views.CustomerViews;

import Backend.Branch;
import Database.BranchDBHelper;
import Database.DataStructs.Branch_T;
import Database.DataStructs.IDatabaseItem_T;
import Main.SharedResources;
import Views.UIQueryView;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerChooseBranchView extends UIQueryView {
    private final ArrayList<IDatabaseItem_T> branchArr;
    private final BranchDBHelper branchDBHelper;
    private Branch_T branch;
    private int user_request;

    public CustomerChooseBranchView() {
       this.myViewName = this.getClass().getCanonicalName();

        SharedResources.setCurrentBranch(null);
        branchDBHelper = SharedResources.getBranchDBHelper();
        branchArr = branchDBHelper.getAllFromDatabase();
    }

    @Override
    public void show() {
        Branch_T tmpBranch;
        for (int i = 0; i < branchArr.size(); i++) {
            tmpBranch = (Branch_T) branchDBHelper.getFromDatabase(i);
            System.out.println( (i+1) + ": " + tmpBranch.getBranchName() );
        }
    }

    @Override
    public void query() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Branch: ");
        this.user_request = sc.nextInt();
    }

    @Override
    public ViewStatus handleQuery() {
        if ((this.user_request) < 1 || (this.user_request) > (this.branchArr.size()) ) {
            System.out.println("Failed to select branch");
            return ViewStatus.FAIL_AND_GO_BACK;
        }
        branch = (Branch_T) branchDBHelper.getFromDatabase(this.user_request - 1);
        SharedResources.setCurrentBranch(branch);

        SharedResources.setCurrentBeBranch(new Branch());

        System.out.println("Chosen Branch: " + branch.getBranchName());
        return ViewStatus.SUCCESS_AND_GO_BACK;
    }
}
