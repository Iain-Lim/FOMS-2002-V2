package Database;

import Database.DataStructs.Branch_T;
import Database.DataStructs.MenuItem_T;

public class BranchDBHelper extends DatabaseHelper {
    public BranchDBHelper(String databaseString) {
        super(databaseString);
    }

    public boolean isInDatabase(Branch_T branchPartial) {
        Branch_T branchTemp;
        for (int i = 0; i < this.databaseObject.size(); i++) {
            branchTemp = (Branch_T) this.databaseObject.get(i);
            if (
                    branchPartial.getBranchUUID() == (branchTemp.getBranchUUID()) ||
                    branchPartial.getBranchName().equals(branchTemp.getBranchName())
            ) {
                return true;
            }
        }
        return false;
    }

    public boolean addToDatabase(Branch_T branchFull) {
        if (this.isInDatabase(branchFull)) {
//            branch exists
            return false;
        }
        return this.databaseObject.add(branchFull);
    }
}
