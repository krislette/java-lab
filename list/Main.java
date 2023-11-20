package list;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        // An ARRAY LIST is a RESIZABLE array.
        // Array list DOES NOT use SQUARE BRACKET.
        // Syntax: ArrayList<DataType> identifier = new ArrayList<DataType>();
        // It only uses NON-PRIMITIVE data types. (User-defined) or String, Integer Class, etc.
        // ArrayList<String> arrNames = new ArrayList<String>();
        // ArrayList<Integer> arrNumbers = new ArrayList<Integer>(); // WRAPPER CLASS I KNEW IT!!!
        // ArrayList<Student> arrStudents = new ArrayList<Student>();
        
        /***************** STRING NON-PRIMITIVE DATA TYPE ****************/
        // CREATE
        ArrayList<String> arrNames = new ArrayList<String>();
        arrNames.add("Acelle");
        arrNames.add("Regina");
        
        // READ
        System.out.println(arrNames.get(0));    // Direct printing.

        String strName = arrNames.get(1);
        System.out.println(strName);            // Variable printing.

        // UPDATE
        System.out.println("Original Value\t: " + arrNames.get(0));
        arrNames.set(0, "Krislette");
        System.out.println("Updated Value\t: " + arrNames.get(0));

        // DELETE
        arrNames.remove(0);
        System.out.println("New value at index 0: " + arrNames.get(0));

        // ADDITIONAL OPERATIONS
        System.out.println("Size: " + arrNames.size()); // We can put it inside a variable.
        
        /**************** INTEGER NON-PRIMITIVE DATA TYPE *****************/
        // CREATE
        ArrayList<Integer> arrNumbers = new ArrayList<Integer>();
        arrNumbers.add(8);
        arrNumbers.add(1);
        
        /************ TWO WAYS OF ADDING A USER-DEFINED OBJECT ************/
        // First: (Efficient Way)
        // CREATE
        ArrayList<Student> arrStudents = new ArrayList<Student>();
        arrStudents.add(new Student("Acelle", "BSCS"));
        // Second: (Not Recommended)
        Student studOne = new Student("Regina", "BSCS");
        arrStudents.add(studOne);
        
        // READ
        Student studTwo = arrStudents.get(0);       // Longer way of invoking a method.
        studTwo.printIntroduction();
        arrStudents.get(1).printIntroduction();     // Efficient way of invoking a method.
        
        // UPDATE
        System.out.print("Original Value\t: ");
        arrStudents.get(0).printIntroduction();
        arrStudents.set(0, new Student("Krislette", "BSCE"));
        System.out.print("Updated Value\t: ");
        arrStudents.get(0).printIntroduction();

        // DELETE
        arrStudents.remove(1);
        // System.out.println(arrStudents.get(1)); // Error. Because there's no index 1 now.
        // This for loop should print 1 student only (Krislette, BSCE)...
        // Because we deleted the second student (Regina, BSCS).
        for (Student student : arrStudents) {
            System.out.println(student.strName);
            System.out.println(student.strCourse);
            student.printIntroduction();
        }
        arrStudents.clear();

        // ADDITIONAL OPERATIONS
        System.out.println("Size: " + arrStudents.size()); // We can put it inside a variable.
    }

}