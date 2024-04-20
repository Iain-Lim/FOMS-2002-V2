package Database;

import Database.DataStructs.Branch_T;
import Database.DataStructs.MenuItem_T;

public class MenuDBHelper extends DatabaseHelper {
    public MenuDBHelper(String databaseString) {
        super(databaseString);
    }

    public boolean isInDatabase(MenuItem_T menuItemPartial) {
        MenuItem_T menuItemTemp;
        for (int i = 0; i < this.databaseObject.size(); i++) {
            menuItemTemp = (MenuItem_T) this.databaseObject.get(i);
            if (menuItemPartial.getMenuItemUUID().equals(menuItemTemp.getMenuItemUUID())) {
                return true;
            }
        }
        return false;
    }

    public boolean addToDatabase(MenuItem_T menuItemFull) {
        if (this.isInDatabase(menuItemFull)) {
//            menuItemId exists
            return false;
        }
        return this.databaseObject.add(menuItemFull);
    }
}
