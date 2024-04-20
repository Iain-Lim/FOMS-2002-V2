package Database.DataStructs;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public class Order_T implements java.io.Serializable {
    private UUID orderId;
    private UUID branchId;
    private UUID customerId;
    private Timestamp ts;
    private ArrayList<MenuItem_T> menuItems;

    public Order_T() { }
}
