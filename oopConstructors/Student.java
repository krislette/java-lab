package oopConstructors;

public class Student {
    
    String strFName, strLName, strCourse;
    int intYear, intSection;
    float fltMidtermGrade, fltFinalGrade;  

    Student(String strFName, String strLName, int intYear, String strCourse, int intSection, float fltMidtermGrade, float fltFinalGrade) {
        this.strFName = strFName;
        this.strLName = strLName;
        this.intYear = intYear;
        this.strCourse = strCourse;
        this.intSection = intSection;
        this.fltMidtermGrade = fltMidtermGrade;
        this.fltFinalGrade = fltFinalGrade;
    }

    void introduceSelf() {
        System.out.println("Full name: " + strFName + " " + strLName);
        System.out.println("Course, year, and section: " + strCourse + " " + intYear + "-" + intSection);
    }

    void evaluateGrade() {
        System.out.println("Midterm Grade: " + fltMidtermGrade);
        System.out.println("Final Grade: " + fltFinalGrade);
        
        // Getting the average.
        float fltAverageGrade = (fltMidtermGrade + fltFinalGrade) / 2;
        System.out.println("Average Grade: " + fltAverageGrade);

        if (fltAverageGrade >= 100) {
            System.out.println("Invalid grade.");
        } else if (fltAverageGrade >= 98) {
            System.out.println("With Highest Honors.");
        } else if (fltAverageGrade >= 95) {
            System.out.println("With High Honors.");
        } else if (fltAverageGrade >= 90) {
            System.out.println("With Honors.");
        } else if (fltAverageGrade >= 75) {
            System.out.println("Passed.");
        } else {
            System.out.println("Failed.");
        }
    }

}