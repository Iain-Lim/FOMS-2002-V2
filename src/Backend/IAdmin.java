package Backend;

public interface IAdmin {
    boolean addStaff();
    boolean editStaff();
    boolean removeStaff();
    void displayAllStaff();
    boolean promoteStaff();
    boolean transferStaff();
    boolean addPaymentMethod();
    boolean removePaymentMethod();
    boolean addBranch();
    boolean removeBranch();
}
