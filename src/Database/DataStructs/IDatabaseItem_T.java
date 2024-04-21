package Database.DataStructs;

/**
* all DataStructs implements this interface
* prettyPrint() -> from JSON to string, but with indentation + look nice
*/
public interface IDatabaseItem_T extends java.io.Serializable {
    String prettyPrint();
}
