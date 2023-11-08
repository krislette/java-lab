package oopConstructors;

public class Product {

    // Here are the GLOBAL variables.
    String strName;
    float fltPrice;
    
    // What is THIS keyword?
    // The THIS keyword refers to the CLASS itself.
    // Whenever we use THIS, ina-access natin yung global variables sa TAAS.
    Product(String strName, float fltPrice) {
        // Notice the COLORS!!!
        // Yung hinihingi nating name (from the arguments) which is color orange...
        // Ayun yung ia-assign natin sa GLOBAL variable (this.NAME) na color white
        this.strName = strName;
        this.fltPrice = fltPrice;

        // For checking if we really did get the input:
        System.out.println(strName + " created.");
        System.out.println(fltPrice + " created.");
    }

}