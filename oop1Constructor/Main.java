package oop1Constructor;

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

        Student Acelle = new Student("Acelle", "Rosales", 2, "BSCS", 5, 95.5f, 98.8f);
        Acelle.introduceSelf();
        Acelle.evaluateGrade();
    }

}