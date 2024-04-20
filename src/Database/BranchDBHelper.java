package Database;

import Database.DataStructs.Branch_TI;
import Database.DataStructs.MenuItem_TI;

public class BranchDBHelper extends DatabaseHelper {
    public BranchDBHelper(String databaseString) {
        super(databaseString);
    }

    public boolean isInDatabase(Branch_TI branchPartial) {
        Branch_TI branchTemp;
        for (int i = 0; i < this.databaseObject.size(); i++) {
            branchTemp = (Branch_TI) this.databaseObject.get(i);
            if (
                    branchPartial.getBranchId().equals(branchTemp.getBranchId()) ||
                    branchPartial.getBranchName().equals(branchTemp.getBranchName())
            ) {
                return true;
            }
        }
        return false;
    }

    public boolean addToDatabase(Branch_TI branchFull) {
        if (this.isInDatabase(branchFull)) {
//            username exists
            return false;
        }
        return this.databaseObject.add(branchFull);
    }

    public boolean addMenuItemToBranchDatabase(Branch_TI branchPartial, MenuItem_TI menuItem) {
        return false;
    }
}
