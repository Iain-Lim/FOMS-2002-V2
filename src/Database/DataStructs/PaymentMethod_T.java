package Database.DataStructs;

import java.util.UUID;

import Main.SharedResources;

public class PaymentMethod_T implements IDatabaseItem_T {
    private UUID paymentMethodId;
    private String paymentMethodName; //Master, Visa, Paylah, PayNow, Nets
    private PaymentType paymentType;


    public PaymentMethod_T() { }

    public PaymentMethod_T(String paymentMethodName, PaymentType paymentType)
    {
        this.paymentMethodName = paymentMethodName;
        this.paymentType = paymentType;
    }

    public PaymentMethod_T(UUID paymentMethodId, String paymentMethodName, PaymentType paymentType)
    {
        this.paymentMethodId = paymentMethodId;
        this.paymentMethodName = paymentMethodName;
        this.paymentType = paymentType;
    }


    public UUID getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(UUID paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getPaymentName() {
        return paymentMethodName;
    }

    public void setPaymentName(String paymentMethodName) {
        this.paymentMethodName = paymentMethodName;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    
    
    @Override
    public String toString() {
        return "PaymentMethod_T{" +
                "paymentMethodId=" + paymentMethodId +
                "paymentMethodName=" + paymentMethodName +
                "paymentType=" + paymentType +
                '}';
    }

    @Override
    public String prettyPrint() {
        return "PaymentMethod_T{" +
                "paymentMethodName=" + paymentMethodName +
                ", paymentType=" + paymentType +
                '}';
    }

    @Override
    public boolean addMeToDB() {
        return SharedResources.getPaymentMethodDBHelper().addToDatabase(this);
    }

    public boolean isInDB() {
        return SharedResources.getPaymentMethodDBHelper().isInDatabase(this);
    }
}