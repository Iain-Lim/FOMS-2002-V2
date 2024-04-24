package Database.DataStructs;

public enum PaymentType {
    CREDIT_CARD('C'), DEBIT_CARD('D'), QR('Q'), OTHERS('O');

    public char toChar() {
        return toChar;
    }

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

    private final char toChar;
    PaymentType(char toChar) {
        this.toChar = toChar;
    }
}