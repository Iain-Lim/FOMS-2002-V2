package Views.StaffViews.BranchManagerViews;

import Views.MenuViews.MenuDisplayView;
import Views.UIQueryView;
import Views.UIView;

import java.util.Scanner;

public class BranchManagerAmendMenuView extends UIQueryView {
    private int user_request;
    public BranchManagerAmendMenuView() {
        this.myViewName = this.getClass().getCanonicalName();
    }

    @Override
    public void show() {
        UIView cartView = new MenuDisplayView();
        cartView.showAndQuery();
    }

    @Override
    public void query() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Update: ");
        this.user_request = sc.nextInt();
    }

    @Override
    public ViewStatus handleQuery() {
//        todo edit menu
        return ViewStatus.SUCCESS_AND_GO_BACK;
    }
}
