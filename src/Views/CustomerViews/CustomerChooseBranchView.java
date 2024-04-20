package Views.CustomerViews;

import Views.UIQueryView;

import java.util.Scanner;

public class CustomerChooseBranchView extends UIQueryView {
    public CustomerChooseBranchView() {
        myViewName = "Views.CustomerViews.ChooseBranchView";
    }

    String chooseBranch;

    @Override
    public void query() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Branch: ");
        chooseBranch = sc.nextLine();
    }

    @Override
    public ViewStatus handleQuery() {
//        #todo connect this to db
        if (
                true
        ) {
            return ViewStatus.SUCCESS_AND_GO_BACK;
        }
        return ViewStatus.FAIL_AND_GO_BACK;
    }

}
