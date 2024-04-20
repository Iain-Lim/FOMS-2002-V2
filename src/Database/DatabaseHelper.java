package Database;

import java.io.*;
import java.util.ArrayList;

public class DatabaseHelper {
    protected String databasePath = "";

    protected ArrayList<Serializable> databaseObject;

    public DatabaseHelper(String databasePath) {
        this.databasePath = databasePath;

//        initialize databaseObject
        this.databaseObject = new ArrayList<>();
    }

    public boolean saveToDb() {
        try(
                FileOutputStream fout = new FileOutputStream(this.databasePath);
                ObjectOutputStream oos = new ObjectOutputStream(fout);
        ){
            for (int i = 0; i < this.databaseObject.size(); i++) {
                oos.writeObject(this.databaseObject.get(i));
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean addToDatabase(Serializable obj) {
        this.databaseObject.add(obj);
        return true;
    }

    public void updateDataInDatabase(int idx, Serializable obj) {
        this.databaseObject.set(idx, obj);
    }

    public boolean isInDatabase(Serializable obj) {
        return this.databaseObject.contains(obj);
    }

    public int idxInDatabase(Serializable obj) {
        return this.databaseObject.indexOf(obj);
    }

    public void removeFromDatabase(int idx) {
        try {
            this.databaseObject.remove(idx);
        } catch (Exception e) {
            return;
        }
    }

    public void removeFromDatabase(Serializable obj) {
        this.databaseObject.remove(obj);
    }

    public void removeAllFromDatabase() {
        this.databaseObject = new ArrayList<Serializable>();
    }

    public Serializable getFromDatabase(int idx) {
        return this.databaseObject.get(idx);
    }

    public ArrayList<Serializable> getAllFromDatabase() {
        return this.databaseObject;
    }

    public boolean getFromDb() {
        boolean isOk = false;
        ArrayList<Serializable> tempDatabaseObject = new ArrayList<>();

        ObjectInputStream ios = null;
        try {
            ios = new ObjectInputStream(new FileInputStream(this.databasePath));
        } catch (Exception e) {
            return false;
        }

//        read till EOF
        Object temp;
        try {
            while (true) {
                temp = ios.readObject();
                if(temp == null) break;
                tempDatabaseObject.add((Serializable) temp);
            }
        } catch (Exception ignored) { }

        try {
            ios.close();
            isOk = true;
        } catch (IOException ignored) { }

        this.databaseObject = (ArrayList<Serializable>) tempDatabaseObject.clone();
        return isOk;
    }

    public void printAllInDatabase() {
        for (Serializable obj : this.databaseObject) {
            System.out.println(obj.toString());
        }
    }
}

