package abstraction;

public class Dog extends Animal {
    
    // Here... we are FORCED to make a makeSound() method.
    // or else... it will throw an error.
    void makeSound() {
        System.out.println("BAWOWOWOWOAH! ahahah");
    }

}

// SUBCLASS of the SUPERCLASS Animal.