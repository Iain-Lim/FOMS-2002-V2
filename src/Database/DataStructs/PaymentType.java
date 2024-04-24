package Database.DataStructs;

public enum PaymentType {
    CREDIT_CARD("Credit Card"), DEBIT_CARD("Debit Card"), QR("QR Code"), OTHERS("Others"), NA("N.A.");

    public String toString() {
        return toString;
    }

    private final String toString;
    PaymentType(String toString) {
        this.toString = toString;
    }
}
