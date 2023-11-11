package abstwaction;

public class Frog implements Animal, WaterAnimal, LandAnimal {
    
    public void makeSound() {
        System.out.println("WAKWAKAWAKWK");
    }

    public void walk() {

    }

    public void swim() {

    }

}

// Uses `implements` keyword, instead of `extends`.