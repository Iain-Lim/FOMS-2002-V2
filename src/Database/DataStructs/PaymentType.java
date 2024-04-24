package Database.DataStructs;

public enum PaymentType {
    CREDIT_CARD('C'), DEBIT_CARD('D'), QR('Q'), OTHERS('O');

    public char toChar() {
        return toChar;
    }

    private final char toChar;
    PaymentType(char toChar) {
        this.toChar = toChar;
    }
}