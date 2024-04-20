package Main;

import Database.DataStructs.StaffType;
import Database.DataStructs.User_T;
import Database.UserDBHelper;
import Views.Main.MainView;
import Views.UIView;

import java.util.Random;
import java.util.UUID;

public class Main {
    public static UIView mainView;
    public static UserDBHelper userDatabaseHelper;

    public static void testDB() {
        System.out.println("User database: " + userDatabaseHelper.getAllFromDatabase().size());
        userDatabaseHelper.printAllInDatabase();
    }

    public static void addStub() {
        Random rando = new Random();

        User_T user;
        String username;
        for (int i = 0; i < 5; i++) {
            username = "user_" + i;
            user = new User_T(UUID.randomUUID(), username, "password", true, StaffType.NORMAL_STAFF);
            userDatabaseHelper.addToDatabase(user);
        }
        for (int i = 5; i < 10; i++) {
            username = "user_" + i;
            user = new User_T(UUID.randomUUID(), username, "password", true, StaffType.BRANCH_MANAGER);
            userDatabaseHelper.addToDatabase(user);
        }

        username = "admin";
        user = new User_T(UUID.randomUUID(), username, "admin", true, StaffType.ADMIN);
        userDatabaseHelper.addToDatabase(user);
    }

    public static void main(String[] args) {
        userDatabaseHelper = new UserDBHelper("./userDatabase.ser");
//        open connection
        userDatabaseHelper.getFromDb();
        SharedResources.setUserDatabaseHelper(userDatabaseHelper);

        testDB();
        addStub();

        mainView = new MainView();
        mainView.showAndQuery();

//        close connection
        userDatabaseHelper.saveToDb();
    }
}