package Database;

import Database.DataStructs.MenuItem_TI;

public class MenuDBHelper extends DatabaseHelper {
    public MenuDBHelper(String databaseString) {
        super(databaseString);
    }

    public boolean isInDatabase(MenuItem_TI menuItemPartial) {
        MenuItem_TI menuItemTemp;
        for (int i = 0; i < this.databaseObject.size(); i++) {
            menuItemTemp = (MenuItem_TI) this.databaseObject.get(i);
            if (menuItemPartial.getMenuItemUUID().equals(menuItemTemp.getMenuItemUUID())) {
                return true;
            }
        }
        return false;
    }

    public boolean addToDatabase(MenuItem_TI menuItemFull) {
        if (this.isInDatabase(menuItemFull)) {
//            menuItemId exists
            return false;
        }
        return this.databaseObject.add(menuItemFull);
    }
}
