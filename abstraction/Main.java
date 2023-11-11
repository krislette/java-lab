package abstraction;

public class Main {
    
    public static void main(String[] args) {
        // ABSTRACT IDEA:
        // Animal a1 = new Animal(); // <- Useless.
        // Abstract classes cannot be instantiated.

        // CONCRETE IDEA:
        Animal d1 = new Dog();
        Animal c1 = new Cat();

        d1.makeSound();
        c1.makeSound();

        d1.setName("Kon");
        c1.setName("Meowth");

        d1.showName();
        c1.showName();
    }

}

// This is our MAIN.