package Database.DataStructs;

import java.util.UUID;

public class User_T implements IDatabaseItem_T {
    private UUID userId;
    private String username;
    private String password;
    private boolean isStaff;
    private StaffType staffType;

    public void setPassword(String password) {
        this.password = password;
    }
    public User_T() {}
    public User_T(String username) {
        this.username = username;
    }

    public User_T(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User_T(UUID userId, String username, String password, boolean isStaff, StaffType staffType) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.isStaff = isStaff;
        this.staffType = staffType;
    }

    public User_T(String username, String password, boolean isStaff, StaffType staffType) {
        this.userId = UUID.randomUUID();
        this.username = username;
        this.password = password;
        this.isStaff = isStaff;
        this.staffType = staffType;
    }

    @Override
    public String toString() {
        return "User_T{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isStaff=" + isStaff +
                ", staffType=" + staffType +
                '}';
    }

    public String prettyPrint() {
        return "User_T{" +
                ", username='" + username + '\'' +
                ", staffType=" + staffType +
                '}';
    }

    public UUID getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public boolean isStaff() {
        return isStaff;
    }

    public StaffType getStaffType() {
        return staffType;
    }

    public String getPassword() {
        return password;
    }

    public boolean verifyPassword(User_T userPartial) {
        return this.password.equals(userPartial.getPassword());
    }

    public void printUser() {
        System.out.println(">> " + this.getUsername() + ", " + this.getStaffType());
    }

}
