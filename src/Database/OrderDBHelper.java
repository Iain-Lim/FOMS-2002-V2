package Database;

import Database.DataStructs.Branch_T;
import Database.DataStructs.Order_T;

public class OrderDBHelper extends DatabaseHelper {
    public OrderDBHelper(String databaseString) {
        super(databaseString);
    }

    public boolean isInDatabase(Order_T orderPartial) {
        Order_T orderTemp;
        for (int i = 0; i < this.databaseObject.size(); i++) {
            orderTemp = (Order_T) this.databaseObject.get(i);
            if (orderPartial.getOrderId().equals(orderTemp.getOrderId())) {
                return true;
            }
        }
        return false;
    }

    public boolean addToDatabase(Order_T orderFull) {
        if (this.isInDatabase(orderFull)) {
//            order exists
            return false;
        }
        return this.databaseObject.add(orderFull);
    }
}
