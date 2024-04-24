package Database.DataStructs;

public enum PaymentType {
    CREDIT_CARD("Credit Card"), DEBIT_CARD("Debit Card"), QR("QR Code"), OTHERS("Others");

    public String toString() {
        return toString;
    }
/*/
    public String getType() {
        switch (this) {
            case CREDIT_CARD:
                return "Credit Card";
            case DEBIT_CARD:
                return "Debit Card";
            case QR:
                return "QR Code";
            case OTHERS:
                return "Others";
            default:
                return null;
        }
    }
*/
    private final String toString;
    PaymentType(String toString) {
        this.toString = toString;
    }
}