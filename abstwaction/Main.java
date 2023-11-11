package abstwaction;

public class Main {
    
    public static void main(String[] args) {
        // ABSTRACT IDEA:
        // Animal a1 = new Animal(); <- Error. We can no longer instantiate ANIMAL because it is abstract (an interface).

        // Kapag HINDI INHERITANCE, wag gagamit ng: Animal a1 = new Dog(); <- STRICTLY.
        Dog d1 = new Dog();
        Bird b1 = new Bird();
        Frog f1 = new Frog();

        d1.makeSound();
        b1.makeSound();
        f1.makeSound();
    }

}

// This is an example of abstraction using INTERFACES.