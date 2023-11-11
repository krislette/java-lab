package abstraction;

public class Cat extends Animal {
    
    // Here... we are FORCED to make a makeSound() method.
    // or else... it will throw an error.
    void makeSound() {
        System.out.println("MAAAWWWW MAAAW!");
    }

}

// SUBCLASS of the SUPERCLASS Animal.