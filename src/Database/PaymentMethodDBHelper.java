package Database;

import Database.DataStructs.PaymentMethod_T;

public class PaymentMethodDBHelper extends DatabaseHelper{
    public PaymentMethodDBHelper(String databaseString) {
        super(databaseString);
    }

    public boolean isInDatabase(PaymentMethod_T paymentMethodPartial) {
        PaymentMethod_T paymentMethodTemp;
        for (int i = 0; i < this.databaseObject.size(); i++) {
            paymentMethodTemp = (PaymentMethod_T) this.databaseObject.get(i);
            if (
                    //paymentMethodPartial.getPaymentMethodId().equals(paymentMethodTemp.getPaymentMethodId()) ||
                    (paymentMethodPartial.getPaymentName().equals(paymentMethodTemp.getPaymentName()) &&
                    paymentMethodPartial.getPaymentType().equals(paymentMethodTemp.getPaymentType()))
            ) {
                return true;
            }
        }
        return false;
    }

    public boolean addToDatabase(PaymentMethod_T newPaymentMethod) {
        if (this.isInDatabase(newPaymentMethod)) {
//            same paymentName and paymentType exists
            return false;
        }
        return this.databaseObject.add(newPaymentMethod);
    }
}
