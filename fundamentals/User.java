package fundamentals;

public class User {
    
    private int userID;
    private String userName;
    private String firstName, lastName;

    User(int userID, String userName, String firstName, String lastName) {
        this.userID = userID;
        this.userName = userName;
        this.firstName = firstName;
        this. lastName = lastName;
    }

    // SETTER and GETTER are object METHODS.
    // Setter is VOID because we only SET VALUE, NOT RETURN VALUE.
    // A setter is like a constructor except it sets only ONE value and constructor can set MULTIPLE values.
    void setUserID(int userID) {
        this.userID = userID;
    }

    // Setter is NOT void because we RETURN a VALUE.
    // It is a method used to get encapsulated variables.
    // We get the VALUE not the VARIABLE so that encapsulates the data. <- emphasis on this.
    int getUserID() {
        return userID;
    }

    // NOTE: Yung gumagawa na nung pags-set at pagg-get ay yung sarili niyang class, hindi na si main. 
    // That means more security! 

    // Getter for username, no setter because we don't want it to be rewritten.
    String getUserName() {
        return userName;
    }

    // SETTER for FIRST NAME.
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // GETTER for FIRST NAME.
    String getFirstName() {
        return firstName;
    }

    // SETTER for LAST NAME.
    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // GETTER for LAST NAME.
    String getLastName() {
        return lastName;
    }
    
}