package fundamentals;

public class Employee {
    
    private String strFirstName, strLastName;
    private String strTitle, strAddress, strSex;
    private int intAge;

    // This first constructor has no PARAMETERS... meaning we can set DEFAULT values here.
    Employee() {
        strFirstName = "N/A";
        strLastName = "N/A";
        strTitle = "N/A";
        strAddress = "N/A";
        strSex = "N/A";
        intAge = 0;
    }

    Employee(String strFirstName, 
            String strLastName, 
            String strTitle, 
            String strAddress, 
            String strSex, 
            int intAge) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strTitle = strTitle;
        this.strAddress = strAddress;
        this.strSex = strSex;
        this.intAge = intAge;
    }

    Employee(String strFirstName, String strLastName, String strTitle) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this. strTitle = strTitle;
        strAddress = "N/A"; // From this point... up until age, the values are DEFAULT (optional).
        strSex = "N/A";
        intAge = 0;
    }

    // From this point onwards, I'll create setters and getters because I love pain.

}