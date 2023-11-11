package abstwaction;

public class Bird implements Animal, AirAnimal {

    public void makeSound() {
        System.out.println("BOOM TARAT TARAT whahaha");
    }

    public void fly() {

    }

    public void walk() {

    }

    // Dito, makukuha natin si walk() kahit hindi nag-implement ng LandAnimal kasi...
    // Inextend natin si AirAnimal (nag-inherit) from WalkAnimal.
    
}

// Uses `implements` keyword, instead of `extends`.