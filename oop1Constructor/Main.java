package oop1Constructor;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Si constructor yung gumagawa/nagi-initialize ng object, hence the name "constructor".
        // System.out.print("Name: ");
        // String strName = input.nextLine();

        // System.out.print("Price: ");
        // float fltPrice = input.nextFloat();

        // Product prod = new Product(strName, fltPrice);        

        Character characterRegina = new Character("Regina", "Hi bitch!", 100, 50, 10);
        characterRegina.talkTo("Acelle");
    }

}