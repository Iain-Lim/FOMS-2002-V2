package Views.CustomerViews;

import Views.UIQueryView;

import java.util.ArrayList;
import java.util.Scanner;

import Database.DataStructs.Branch_T;
import Database.DataStructs.IDatabaseItem_T;
import Main.SharedResources;

public class CustomerChooseBranchView extends UIQueryView {
    public CustomerChooseBranchView() {
        myViewName = "Views.CustomerViews.ChooseBranchView";
    }

    String chosenBranchName;

    /* TODO add the display into the show portion */

    @Override
    public void query() {
        Scanner sc = new Scanner(System.in);

        /* Retrieve and display list of branches */
        // TODO CALL THE BACKEND
        System.out.println("The Available Branches Are");
        ArrayList<IDatabaseItem_T> branches = SharedResources.branchDBHelper.getAllFromDatabase();

        //TODO error checking, maybe reimplement at try-catch
        if (branches.size() == 0){
            System.out.println("No Available Branches");
            return;
        }

        /* Try and follow the same format as menu view liddat. */
        for (int i=0; i<branches.size(); i++){
            Branch_T branch = (Branch_T) branches.get(i);
            System.out.println("Branch Number " + (i+1) + "] " + branch.getBranchName());
        }

        /* Get user input for branch by number */
        System.out.print("Enter branch number: ");

        // TODO implement error checking
        int branchChoice = Integer.parseInt(sc.nextLine());

        Branch_T chosenBranch = (Branch_T) branches.get(branchChoice-1);
        chosenBranchName = chosenBranch.getBranchName();
        SharedResources.setCurrentBranch(chosenBranch);
    }

    @Override
    public ViewStatus handleQuery() {
        // User connected to branch.
        if (
            SharedResources.getCurrentBranch() != null
        ) {
            return ViewStatus.SUCCESS_AND_GO_BACK;
        }
        return ViewStatus.FAIL_AND_GO_BACK;
    }

}
