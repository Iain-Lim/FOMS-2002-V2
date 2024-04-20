package Main;

import Database.BranchDBHelper;
import Database.DataStructs.*;
import Database.DataStructs.Branch_TI;
import Database.DataStructs.MenuItem_TI;
import Database.MenuDBHelper;
import Database.OrderDBHelper;
import Database.UserDBHelper;
import Views.MainViews.MainView;
import Views.UIView;

public class Main {
    public static UIView mainView;
    public static UserDBHelper userDatabaseHelper;
    public static BranchDBHelper branchDBHelper;
    public static OrderDBHelper orderDBHelper;
    public static MenuDBHelper menuDBHelper;


    public static void main(String[] args) {
        userDatabaseHelper = new UserDBHelper("./Data/userDatabase.ser");
        branchDBHelper = new BranchDBHelper("./Data/branchDatabase.ser");
        orderDBHelper = new OrderDBHelper("./Data/orderDatabase.ser");
        menuDBHelper = new MenuDBHelper("./Data/menuDatabase.ser");

//        try catch block but to catch most exceptions, but there should not have any.
        try {
//            open and get from database
            open_databases();

            debug_addStubData();
            showAllDatabases();

//            call main display function, do not modify
            mainView = new MainView();
            mainView.showAndQuery();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close_databases();
        }
    }

    public static void showAllDatabases() {
        System.out.println("User database: " + userDatabaseHelper.getAllFromDatabase().size());
        userDatabaseHelper.printAllInDatabase(false);

        System.out.println("Menu database: " + menuDBHelper.getAllFromDatabase().size());
        menuDBHelper.printAllInDatabase(false);

        System.out.println("Branch database: " + branchDBHelper.getAllFromDatabase().size());
        branchDBHelper.printAllInDatabase(false);

        System.out.println("Order database: " + orderDBHelper.getAllFromDatabase().size());
        orderDBHelper.printAllInDatabase(false);
    }

    public static void debug_addStubData() {
        User_TI user;
        String username;
        for (int i = 0; i < 5; i++) {
            username = "user_" + i;
            user = new User_TI(username, "password", true, StaffType.NORMAL_STAFF);
            userDatabaseHelper.addToDatabase(user);
        }
        for (int i = 5; i < 10; i++) {
            username = "user_" + i;
            user = new User_TI(username, "password", true, StaffType.BRANCH_MANAGER);
            userDatabaseHelper.addToDatabase(user);
        }

        username = "admin";
        user = new User_TI(username, "admin", true, StaffType.ADMIN);
        userDatabaseHelper.addToDatabase(user);

        Branch_TI branch;
        branch = new Branch_TI("Changi City Point");

        MenuItem_TI menuItem;
        menuItem = new MenuItem_TI(10.10f, MenuItem_TI.AVAILABILITY.AVAILABLE, "Hot Tacos", "Hot Tacos", MenuItem_TI.CATEGORIES.SET_MEAL);
        menuDBHelper.addToDatabase(menuItem);
        branch.addMenuItem(menuItem);

        menuItem = new MenuItem_TI(2.10f, MenuItem_TI.AVAILABILITY.AVAILABLE, "Ice Milo", "Ice Milo", MenuItem_TI.CATEGORIES.DRINK);
        menuDBHelper.addToDatabase(menuItem);
        branch.addMenuItem(menuItem);

        menuItem = new MenuItem_TI(0.90f, MenuItem_TI.AVAILABILITY.AVAILABLE, "Cheese Fries", "Cheese Fries", MenuItem_TI.CATEGORIES.SIDE);
        menuDBHelper.addToDatabase(menuItem);
        branch.addMenuItem(menuItem);

        branchDBHelper.addToDatabase(branch);
    }

    private static void open_databases() {
        userDatabaseHelper.getFromDb();
        branchDBHelper.getFromDb();
        orderDBHelper.getFromDb();
        menuDBHelper.getFromDb();

        SharedResources.setUserDatabaseHelper(userDatabaseHelper);
        SharedResources.setBranchDBHelper(branchDBHelper);
        SharedResources.setOrderDBHelper(orderDBHelper);
        SharedResources.setMenuDBHelper(menuDBHelper);
    }

    private static void close_databases() {
        userDatabaseHelper.saveToDb();
        userDatabaseHelper = null;
        SharedResources.setUserDatabaseHelper(null);

        branchDBHelper.saveToDb();
        branchDBHelper = null;
        SharedResources.setBranchDBHelper(null);

        orderDBHelper.saveToDb();
        orderDBHelper = null;
        SharedResources.setOrderDBHelper(null);

        menuDBHelper.saveToDb();
        menuDBHelper = null;
        SharedResources.setMenuDBHelper(null);
    }
}