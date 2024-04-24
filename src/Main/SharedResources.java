package Main;

import Backend.Branch;
import Backend.Staff;
import Database.*;
import Database.DataStructs.Branch_T;
import Database.DataStructs.PaymentMethod_T;
import Database.DataStructs.User_T;

public class SharedResources {
    private static UserDBHelper userDatabaseHelper;
    private static OrderDBHelper orderDBHelper;
    private static BranchDBHelper branchDBHelper;
    private static MenuDBHelper menuDBHelper;
    private static PaymentMethodDBHelper paymentMethodDBHelper;
    private static PaymentMethod_T currentPaymentMethod;
    private static Staff currStaffB;
    private static User_T currentUserT;
    private static Branch_T currentBranchT;
    private static Branch currentBranchB;
    private static String jumpToView = "";
    private static String errorMessage = "";
    public static PaymentMethod_T getCurrentPaymentMethod() {
        return currentPaymentMethod;
    }

    public static void setCurrentPaymentMethod(PaymentMethod_T currentPaymentMethod) {
        SharedResources.currentPaymentMethod = currentPaymentMethod;
    }

    public static PaymentMethodDBHelper getPaymentMethodDBHelper() {
        return paymentMethodDBHelper;
    }
    public static void setPaymentMethodDBHelper(PaymentMethodDBHelper paymentMethodDBHelper) {
        SharedResources.paymentMethodDBHelper = paymentMethodDBHelper;
    }

    public static UserDBHelper getUserDatabaseHelper() {
        return userDatabaseHelper;
    }

    public static void setUserDatabaseHelper(UserDBHelper userDatabaseHelper) {
        SharedResources.userDatabaseHelper = userDatabaseHelper;
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

    public static MenuDBHelper getMenuDBHelper() {
        return menuDBHelper;
    }

    public static void setMenuDBHelper(MenuDBHelper menuDBHelper) {
        SharedResources.menuDBHelper = menuDBHelper;
    }

    public static Staff getCurrStaffB() {
        return currStaffB;
    }

    public static void setCurrStaffB(Staff currStaffB) {
        SharedResources.currStaffB = currStaffB;
    }

    public static User_T getCurrentUserT() {
        return currentUserT;
    }

    public static void setCurrentUserT(User_T currentUserT) {
        SharedResources.currentUserT = currentUserT;
    }

    public static Branch_T getCurrentBranchT() {
        return currentBranchT;
    }

    public static void setCurrentBranchT(Branch_T currentBranchT) {
        SharedResources.currentBranchT = currentBranchT;
    }

    public static Branch getCurrentBranchB() {
        return currentBranchB;
    }

    public static void setCurrentBranchB(Branch currentBranchB) {
        SharedResources.currentBranchB = currentBranchB;
    }

    public static String getJumpToView() {
        return jumpToView;
    }

    public static void setJumpToView(String jumpToView) {
        SharedResources.jumpToView = jumpToView;
    }

    public static String getErrorMessage() {
        return errorMessage;
    }

    public static void setErrorMessage(String errorMessage) {
        SharedResources.errorMessage = errorMessage;
    }
}
