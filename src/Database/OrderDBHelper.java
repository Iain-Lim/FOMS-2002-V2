package Database;

import Database.DataStructs.Order_TI;

public class OrderDBHelper extends DatabaseHelper {
    public OrderDBHelper(String databaseString) {
        super(databaseString);
    }

    public boolean isInDatabase(Order_TI orderPartial) {
        Order_TI orderTemp;
        for (int i = 0; i < this.databaseObject.size(); i++) {
            orderTemp = (Order_TI) this.databaseObject.get(i);
            if (orderPartial.getOrderId().equals(orderTemp.getOrderId())) {
                return true;
            }
        }
        return false;
    }

    public boolean addToDatabase(Order_TI orderFull) {
        if (this.isInDatabase(orderFull)) {
//            order exists
            return false;
        }
        return this.databaseObject.add(orderFull);
    }
}
