package fundamentals;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // javac oop1Constructor/Main.java oop1Constructor/Character.java oop1Constructor/Person.java oop1Constructor/Product.java
        // The code above is used to compile multiple .java files at once, outside the folder.
        // From now on, I have to practice compiling EVERY SINGLE TIME.

        // Si constructor yung gumagawa/nagi-initialize ng object, hence the name "constructor".
        // System.out.print("Name: ");
        // String strName = input.nextLine();

        // System.out.print("Price: ");
        // float fltPrice = input.nextFloat();

        // Product prod = new Product(strName, fltPrice);   
        
        // System.out.println(prod.fltPrice);
        // System.out.println(prod.strName);

        // Character characterRegina = new Character("Regina", "Hi bitch!", 100, 50, 10);
        // characterRegina.talkTo("Acelle");

        // Person Acelle = new Person("Acelle", "Rosales", 'F', 18);
        // System.out.println(Acelle.strLastName);

        // Student Acelle = new Student("Acelle", "Rosales", 2, "BSCS", 5, 95.5f, 98.8f);
        // Acelle.introduceSelf();
        // Acelle.evaluateGrade();

        // Encapsulation.
        User Acelle = new User(202209133, "krislette", "Acelle", "Rosales");
        // We use GETTERS and SETTERS in order to access ENCAPSULATED data.

        // Get the existing USER ID.
        int intUserID = Acelle.getUserID();
        System.out.println("New User ID: " + intUserID);

        // Sets a new USER ID.
        Acelle.setUserID(202209058);
        
        // Get the NEW USER ID.
        int intNewUserID = Acelle.getUserID();
        System.out.println("New User ID: " + intNewUserID);

        // To make something READ-ONLY: use GETTERS only and do not implement setters.
        // To make something WRITE-ONLY: use SETTERS only and do not implement getters.
    }

}