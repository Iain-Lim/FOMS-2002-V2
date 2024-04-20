package Database.DataStructs;

public enum StaffType {
    ADMIN('A'), BRANCH_MANAGER('B'), NORMAL_STAFF('S'), NA('N');

    public char toChar() {
        return toChar;
    }

    private final char toChar;
    StaffType(char toChar) {
        this.toChar = toChar;
    }
}