/**
 Represents a MenuItem
 @author Scott Cheng
 @version 1.0
 @since 2024-03-22
 */

package Database.DataStructs;

public class MenuItem_T implements java.io.Serializable {

    /**
     * MenuItem category
     */
    public enum CATEGORIES {
        DRINK,
        NA,
        SET_MEAL,
        SIDE

    }

    /**
     * is item available?
     */
    public enum AVAILABILITY {
        AVAILABLE,
        NA,
        NOT_AVAILABLE
    }

    ;
    private float price;
    private AVAILABILITY availability;
    private String description;
    private CATEGORIES category;

    public MenuItem_T() {}

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public AVAILABILITY getAvailability() {
        return availability;
    }

    public void setAvailability(AVAILABILITY availability) {
        this.availability = availability;
    }
}
