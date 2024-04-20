package Database;

import Database.DataStructs.User_TI;

public class UserDBHelper extends DatabaseHelper {
    public UserDBHelper(String databaseString) {
        super(databaseString);
    }

    public int idxInDatabase_username(User_TI userPartial, boolean getFirst) {
        int idx = -1;
        User_TI userTemp;
        for (int i = 0; i < this.databaseObject.size(); i++) {
            userTemp = (User_TI) this.databaseObject.get(i);
            if (userPartial.getUsername().equals(userTemp.getUsername())) {
                idx = i;
                if (getFirst) {
                    return idx;
                }
            }
        }
        return idx;
    }

    public boolean isInDatabase(User_TI userPartial) {
        User_TI userTemp;
        for (int i = 0; i < this.databaseObject.size(); i++) {
            userTemp = (User_TI) this.databaseObject.get(i);
            if (userPartial.getUsername().equals(userTemp.getUsername())) {
                return true;
            }
        }
        return false;
    }

    public boolean addToDatabase(User_TI userFull) {
        if (this.isInDatabase(userFull)) {
//            username exists
            return false;
        }
        return this.databaseObject.add(userFull);
    }

//    we can set a enum for status
    public User_TI verifyLogin(User_TI userPartial) {
        int idx = this.idxInDatabase_username(userPartial, true);

        //        username DNE
        if (idx == -1) return null;

        User_TI userTemp = (User_TI) this.getFromDatabase(idx);

        boolean verified = false;
        verified = userTemp.verifyPassword(userPartial);
        if (verified) return userTemp;

        return null;
    }

    public boolean updateUserPassword(User_TI userPartial) {
        int idx = this.idxInDatabase_username(userPartial, true);
        //        username DNE
        if (idx == -1) return false;

        User_TI userTemp = (User_TI) this.getFromDatabase(idx);
        userTemp.setPassword(userPartial.getPassword());

        this.updateDataInDatabase(idx, userTemp);
        return true;
    }

}
