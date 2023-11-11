package encapsulation;

public class User {
    
    private int intUserID;
    private String strUserName;
    private String strFirstName, strLastName;

    User(int intUserID, String strUserName, String strFirstName, String strLastName) {
        this.intUserID = intUserID;
        this.strUserName = strUserName;
        this.strFirstName = strFirstName;
        this. strLastName = strLastName;
    }

    // SETTER and GETTER are object METHODS.
    // Setter is VOID because we only SET VALUE, NOT RETURN VALUE.
    // A setter is like a constructor except it sets only ONE value and constructor can set MULTIPLE values.
    void setintUserID(int intUserID) {
        this.intUserID = intUserID;
    }

    // Setter is NOT void because we RETURN a VALUE.
    // It is a method used to get encapsulated variables.
    // We get the VALUE not the VARIABLE so that encapsulates the data. <- emphasis on this.
    int getintUserID() {
        return intUserID;
    }

    // NOTE: Yung gumagawa na nung pags-set at pagg-get ay yung sarili niyang class, hindi na si main. 
    // That means more security! 

    // Getter for strUserName, no setter because we don't want it to be rewritten.
    String getstrUserName() {
        return strUserName;
    }

    // SETTER for FIRST NAME.
    void setstrFirstName(String strFirstName) {
        this.strFirstName = strFirstName;
    }

    // GETTER for FIRST NAME.
    String getstrFirstName() {
        return strFirstName;
    }

    // SETTER for LAST NAME.
    void setstrLastName(String strLastName) {
        this.strLastName = strLastName;
    }

    // GETTER for LAST NAME.
    String getstrLastName() {
        return strLastName;
    }
    
}