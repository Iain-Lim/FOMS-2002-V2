package Database.DataStructs;

import java.util.ArrayList;
import java.util.UUID;

public class Branch_T implements java.io.Serializable {
    private UUID branchId;
    public ArrayList<MenuItem_T> menuItems;
    private String branchName;
    public Branch_T() { }
}
