package array;

public class Employee {
    
    String strFirstName, strLastName;
    String strJobTitle;

    Employee(String strFirstName, String strLastName, String strJobTitle) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strJobTitle = strJobTitle;
    }

    void introduceSelf() {
        System.out.println("Full name: " + strFirstName + " " + strLastName);
        System.out.println("Job title: " + strJobTitle);
    }

}