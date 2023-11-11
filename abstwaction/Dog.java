package abstwaction;

public class Dog implements Animal, LandAnimal {
    
    public void makeSound() {
        System.out.println("RAHHHHHHHHHHHH");
    }

    public void walk() {
        
    }

}

// Uses `implements` keyword, instead of `extends`.