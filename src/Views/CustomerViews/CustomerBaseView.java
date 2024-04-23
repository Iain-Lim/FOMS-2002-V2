package Views.CustomerViews;

import Database.DataStructs.Branch_T;
import Views.UIMenuWithExtraView;
import Views.UIView;
import Views.UIQueryView;
import Views.*;


import Main.SharedResources;

// Should be menu, override show and query 
public class CustomerBaseView extends UIMenuView {
    private Branch_T currBranch;

    public CustomerBaseView() {
        myViewName = "Views.CustomerView";
        this.myViewOptions = new String[] {
                "Choose Branch",
        };
        this.subViews = new UIView[] {
                new CustomerChooseBranchView(),
        };
    }

    // @Override
    // public void show() {
    //     System.out.println();
    //     if (currBranch != null)
    //     {
    //         System.out.println("Branch: " + currBranch.getBranchName());
    //     } else {
    //         System.out.println("No Branch Detected");
    //     }
    //     super.show();
    // }

    @Override
    public ViewStatus showAndQuery() {
        currBranch = SharedResources.getCurrentBranch();

        if (currBranch == null) {
            ViewStatus viewStatus;

            UIQueryView chooseBranch = new CustomerChooseBranchView();
            viewStatus = chooseBranch.showAndQuery();

            if (viewStatus == ViewStatus.SUCCESS_AND_GO_BACK) {
                System.out.println("Chose Branch: " + SharedResources.getCurrentBranch().getBranchName());
                currBranch = SharedResources.getCurrentBranch();

            } else if (viewStatus == ViewStatus.FAIL_AND_GO_BACK) {
                // Error in branch choice
                System.out.println("Failed to select branch");
                return ViewStatus.FAIL_AND_GO_BACK;
            }
        }

        // // Branch Order Selection
        // if (SharedResources.getCurrentBranch() != null) {
        //     String[] v = new String[] {
        //         "Order New",
        //         "See Pending Orders"
        //     };
        //     UIView[] sv = new UIView[] {
        //         new CustomerOrderNewView(),
        //         new CustomerPendingOrdersView()
        //     };

        //     this.myExtraViewOptions = v;
        //     this.myExtraSubViews = sv;
        // }

        // continue as user without branch
        super.showAndQuery();

        return ViewStatus.SUCCESS_AND_GO_BACK;
    }
}
