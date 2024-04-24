package Views.StaffViews.NormalStaffViews;

import Backend.Branch;
import Backend.NormalStaff;
import Database.DataStructs.User_T;
import Main.SharedResources;
import Views.UIQueryView;
import Views.UIView;

import java.util.Scanner;

public class StaffProcessOrdersView extends UIQueryView {
    NormalStaff normalStaff;
    Branch branch;

    int user_request;

    public StaffProcessOrdersView() {
       this.myViewName = this.getClass().getCanonicalName();
    }

    @Override
    public void show() {
        UIView newOrdersView = new StaffDisplayOrdersView(true);
        newOrdersView.showAndQuery();
    }

    @Override
    public void query() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Process: ");
        user_request = sc.nextInt();
    }

    @Override
    public ViewStatus handleQuery() {
//        todo process order

        return ViewStatus.SUCCESS_AND_GO_BACK;
    }
}
