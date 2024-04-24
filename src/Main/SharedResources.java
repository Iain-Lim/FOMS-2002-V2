package Main;

import Backend.Branch;
import Backend.Staff;
import Database.BranchDBHelper;
import Database.DataStructs.Branch_T;
import Database.DataStructs.User_T;
import Database.MenuDBHelper;
import Database.OrderDBHelper;
import Database.PaymentMethodDBHelper;
import Database.UserDBHelper;

public class SharedResources {
    private static UserDBHelper userDatabaseHelper;
    private static OrderDBHelper orderDBHelper;
    private static BranchDBHelper branchDBHelper;
    private static MenuDBHelper menuDBHelper;
    private static PaymentMethodDBHelper paymentMethodDBHelper;
    private static Staff currStaff;
    private static User_T currentUser;
    private static Branch_T currentBranch;
    private static Branch currentBeBranch;
    private static String jumpToView = "";
    private static String errorMessage = "";

    public static Branch getCurrentBeBranch() {
        return currentBeBranch;
    }

    public static void setCurrentBeBranch(Branch currentBeBranch) {
        SharedResources.currentBeBranch = currentBeBranch;
    }

    public static Branch_T getCurrentBranch() {
        return currentBranch;
    }

    public static void setCurrentBranch(Branch_T currentBranch) {
        SharedResources.currentBranch = currentBranch;
    }

    public static MenuDBHelper getMenuDBHelper() {
        return menuDBHelper;
    }
    public static void setMenuDBHelper(MenuDBHelper menuDBHelper) {
        SharedResources.menuDBHelper = menuDBHelper;
    }
    public static PaymentMethodDBHelper getPaymentMethodDBHelper() {
        return paymentMethodDBHelper;
    }
    public static void setPaymentMethodDBHelper(PaymentMethodDBHelper paymentMethodDBHelper) {
        SharedResources.paymentMethodDBHelper = paymentMethodDBHelper;
    }
    public static OrderDBHelper getOrderDBHelper() {
        return orderDBHelper;
    }
    public static void setOrderDBHelper(OrderDBHelper orderDBHelper) {
        SharedResources.orderDBHelper = orderDBHelper;
    }
    public static BranchDBHelper getBranchDBHelper() {
        return branchDBHelper;
    }
    public static void setBranchDBHelper(BranchDBHelper branchDBHelper) {
        SharedResources.branchDBHelper = branchDBHelper;
    }
    public static Staff getCurrStaff() {
        return currStaff;
    }
    public static void setCurrStaff(Staff currStaff) {
        SharedResources.currStaff = currStaff;
    }
    public static String getErrorMessage() {
        return errorMessage;
    }
    public static void setErrorMessage(String errorMessage) {
        SharedResources.errorMessage = errorMessage;
    }
    public static String getJumpToView() {
        return jumpToView;
    }
    public static void setJumpToView(String jumpToView) {
        SharedResources.jumpToView = jumpToView;
    }
    public static UserDBHelper getUserDatabaseHelper() {
        return userDatabaseHelper;
    }
    public static void setUserDatabaseHelper(UserDBHelper userDatabaseHelper) {
        SharedResources.userDatabaseHelper = userDatabaseHelper;
    }
    public static User_T getCurrentUser() {
        return currentUser;
    }
    public static void setCurrentUser(User_T currentUser) {
        SharedResources.currentUser = currentUser;
    }
}
