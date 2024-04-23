package Main;

import Backend.Staff;
import Database.BranchDBHelper;
import Database.DataStructs.Branch_T;
import Database.DataStructs.User_T;
import Database.MenuDBHelper;
import Database.OrderDBHelper;
import Database.UserDBHelper;

public class SharedResources {
    public static UserDBHelper userDatabaseHelper;
    public static OrderDBHelper orderDBHelper;
    public static BranchDBHelper branchDBHelper;
    public static MenuDBHelper menuDBHelper;
    public static Staff currStaff;
    public static User_T currentUser;
    public static String jumpToView = "";
    public static String errorMessage = "";
    public static Branch_T currBranch;

    
    public static MenuDBHelper getMenuDBHelper() {
        return menuDBHelper;
    }
    public static void setMenuDBHelper(MenuDBHelper menuDBHelper) {
        SharedResources.menuDBHelper = menuDBHelper;
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





    public SharedResources() {}

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

    public static Branch_T getCurrentBranch() {
        return currBranch;
    }

    public static void setCurrentBranch(Branch_T currBranch) {
        SharedResources.currBranch = currBranch;
    }
}
