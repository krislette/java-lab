package chal;

public class Student {
    
    // Tried encapsulating values because why not?
    private String strFirstName, strLastName;
    private String strCourse, strYear, strSection;

    // Making the constructor for this class...
    Student(String strFirstName, String strLastName, String strCourse, String strYear, String strSection) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strCourse = strCourse;
        this.strYear = strYear;
        this.strSection = strSection;
    }

    public void showCredentials() {
        System.out.println("Full Name:\t\t\t" + strFirstName + " " + strLastName);
        System.out.println("Course, Year, and Section:\t" + strCourse + " " + strYear + "-" + strSection);
    }

    // I made getters and setters for each attribute...
    // ... even though I'll probably won't use them.
    public String getFirstName() {
        return strFirstName;
    }
    
    public void setFirstName(String strFirstName) {
        this.strFirstName = strFirstName;
    }
    
    public String getLastName() {
        return strLastName;
    }

    public void setLastName(String strLastName) {
        this.strLastName = strLastName;
    }
    
    public String getCourse() {
        return strCourse;
    }

    public void setCourse(String strCourse) {
        this.strCourse = strCourse;
    }
    
    public String getYear() {
        return strYear;
    }
    
    public void setYear(String strYear) {
        this.strYear = strYear;
    }

    public String getSection() {
        return strSection;
    }

    public void setSection(String strSection) {
        this.strSection = strSection;
    }

}