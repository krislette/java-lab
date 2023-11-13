package chal;

import java.util.Scanner;

public class Main {
    
    static Scanner input = new Scanner(System.in);
    static Design divider = new Design(); // I made this!

    public static void main(String[] args) {
        divider.displayDesign(60);
        System.out.println("Student Registration Simulation");
        
        // Get the number of students!
        divider.displayDesign(60);
        System.out.print("Enter number of students:\t");
        int intSize = input.nextInt();
        input.nextLine(); // And don't forget to consume that extra new line!

        // Initialized the array to store the objects.
        Student[] arrStudents = new Student[intSize];
        
        // Declared the variables that will be used to store user input(s).
        String strFirstName, strLastName;
        String strCourse, strYear, strSection;
        
        // Will get the credentials for n number of students.
        for (int i = 0; i < arrStudents.length; i++) {
            divider.displayDesign(60);
            System.out.println("Student [" + (i + 1) + "]");
            
            System.out.print("Enter first name:\t");
            strFirstName = input.nextLine();
            
            System.out.print("Enter last name:\t");
            strLastName = input.nextLine();
            
            System.out.print("Enter course:\t\t");
            strCourse = input.nextLine();
            
            System.out.print("Enter year:\t\t");
            strYear = input.nextLine();
            
            System.out.print("Enter section:\t\t");
            strSection = input.nextLine();
            
            arrStudents[i] = new Student(strFirstName, strLastName, strCourse, strYear, strSection);
        }
        divider.displayDesign(60);

        // Printed the credentials in a more efficient way...?
        System.out.println("Here is your record: ");

        for (Student studStudent : arrStudents) {
            divider.displayDesign(60);
            studStudent.showCredentials();
        }
        divider.displayDesign(60);
        
        input.close();
        System.exit(0);
    }
    
}

/* Below is my first solution on printing the students' credentials...
 * I converted the code into a class method inside Student for efficiency.
 * I just honestly wanted to use the getters somehow...
 */ 

// for (Student i : arrStudents) {
//     divider.displayDesign(60);
//     System.out.println("Full Name:\t\t\t" + i.getFirstName() + " " + i.getLastName());
//     System.out.println("Course, Year, and Section:\t" + i.getCourse() + " " + i.getYear() + "-" + i.getSection());
// }