package array;

import java.util.Scanner;

public class Main {
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Employee employees[] = new Employee[5];

        employees[0] = new Employee("Acelle", "Rosales", "Bading");
        employees[1] = new Employee("Regina", "Bonifacio", "UI/UX Lead");

        employees[0].introduceSelf();
        employees[1].introduceSelf();
        
        for (Employee employee : employees) {
            employee.introduceSelf();
        }
    }

}