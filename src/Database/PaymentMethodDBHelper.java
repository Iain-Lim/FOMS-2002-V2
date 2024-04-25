package Database;

import Database.DataStructs.PaymentMethod_T;

public class PaymentMethodDBHelper extends DatabaseHelper {
    public PaymentMethodDBHelper(String databaseString) {
        super(databaseString);
    }

    public int idxInDatabase_PaymentName_Type(PaymentMethod_T paymentMethodPartial, boolean getFirst) {
        int idx = -1;
        PaymentMethod_T paymentMethodTemp;
        for (int i = 0; i < this.databaseObject.size(); i++) {
            paymentMethodTemp = (PaymentMethod_T) this.databaseObject.get(i);
            if (paymentMethodPartial.getPaymentName().equals(paymentMethodTemp.getPaymentName()) &&
                paymentMethodPartial.getPaymentType().equals(paymentMethodTemp.getPaymentType()))
            {
                idx = i;
                if (getFirst) {
                    return idx;
                }
            }
        }
        return idx;
    }

    public boolean isInDatabase(PaymentMethod_T paymentMethodPartial) {
        PaymentMethod_T paymentMethodTemp;
        for (int i = 0; i < this.databaseObject.size(); i++) {
            paymentMethodTemp = (PaymentMethod_T) this.databaseObject.get(i);
            if (
                    (paymentMethodPartial.getPaymentName().equals(paymentMethodTemp.getPaymentName()) &&
                            paymentMethodPartial.getPaymentType().equals(paymentMethodTemp.getPaymentType()))
            ) {
                return true;
            }
        }
        return false;
    }

    public int idxInDatabase_PaymentName_Type(PaymentMethod_T paymentMethodPartial, boolean getFirst) {
        int idx = -1;
        PaymentMethod_T paymentMethodTemp;
        for (int i = 0; i < this.databaseObject.size(); i++) {
            paymentMethodTemp = (PaymentMethod_T) this.databaseObject.get(i);
            if (paymentMethodPartial.getPaymentName().equals(paymentMethodTemp.getPaymentName()) &&
                    paymentMethodPartial.getPaymentType().equals(paymentMethodTemp.getPaymentType()))
            {
                idx = i;
                if (getFirst) {
                    return idx;
                }
            }
        }
        return idx;
    }

    public boolean addToDatabase(PaymentMethod_T newPaymentMethod) {
        if (this.isInDatabase(newPaymentMethod)) {
//            same paymentName and paymentType exists
            return false;
        }
        return this.databaseObject.add(newPaymentMethod);
    }
}
