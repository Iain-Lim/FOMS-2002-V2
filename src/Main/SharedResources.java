package Main;

import Backend.Staff;
import Backend.User;
import Database.DataStructs.User_T;
import Database.UserDBHelper;

public class SharedResources {
    public static UserDBHelper userDatabaseHelper;

    public static Staff getCurrStaff() {
        return currStaff;
    }

    public static void setCurrStaff(Staff currStaff) {
        SharedResources.currStaff = currStaff;
    }

    public static Staff currStaff;
    public static User_T currentUser;

    public static String jumpToView = "";

    public static String errorMessage = "";

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
}
