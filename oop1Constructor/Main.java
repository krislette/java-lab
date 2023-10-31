package oop1Constructor;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Si constructor yung gumagawa/nagi-initialize ng object, hence the name "constructor".
        for (int i = 0; i < 5; i++) {
            System.out.print("Name: ");
            String strName = input.nextLine();
    
            System.out.print("Price: ");
            float fltPrice = input.nextFloat();
    
            Product prod = new Product(strName, fltPrice);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Product " + (i + 1));
            System.out.println(prod.strName);
            System.out.println(prod.strName);
        }
        
        // I have to learn how to incorporate ARRAYS with this...
        // Because there's something WRONG!!!
    }

}