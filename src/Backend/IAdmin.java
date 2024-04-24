package Backend;

import Database.DataStructs.StaffType;
import Database.DataStructs.User_T;

public interface IAdmin {
    boolean addStaff();
    boolean editStaff();
    boolean removeStaff();
    void displayAllStaff();
    boolean promoteStaff(User_T userPartial, StaffType newStaffType);
    boolean transferStaff();
    boolean addPaymentMethod();
    boolean removePaymentMethod();
    boolean addBranch();
    boolean removeBranch();
}
