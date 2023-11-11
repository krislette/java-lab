package overloading;

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
    String getFirstName() {
        return strFirstName;
    }
    
    void setFirstName(String strFirstName) {
        this.strFirstName = strFirstName;
    }
    
    String getLastName() {
        return strLastName;
    }
    
    void setLastName(String strLastName) {
        this.strLastName = strLastName;
    }

    String getTitle() {
        return strTitle;
    }

    void setTitle(String strTitle) {
        this.strTitle = strTitle;
    }

    String getAddress() {
        return strAddress;
    } 

    void setAddress(String strAddress) {
        this.strAddress = strAddress;
    } 

    String getSex() {
        return strSex;
    }

    void setSex(String strSex) {
        this.strSex = strSex;
    }

    int getAge() {
        return intAge;
    }

    void setAge(int intAge) {
        this.intAge = intAge;
    }

}