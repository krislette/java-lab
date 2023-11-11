package polymorphism;

public class Main {
    
    public static void main(String[] args) {
        // This is how we normally instantiate...
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        // Here, we are overriding the makeSound method of Animal superclass.
        d1.makeSound();
        c1.makeSound();

        // Here... we implement POLYMORPHISM.
        // We instantiate using a single class (Animal) with different forms (Dog and Cat).
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();
        a2.makeSound();
    }

}

// This is our MAIN.