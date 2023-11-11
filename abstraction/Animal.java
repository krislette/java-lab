package abstraction;

public abstract class Animal {

    String strName;
    
    // void makeSound() {
    //     System.out.println("Overridable Method.");
    // }

    // ^^^ Instead of doing the upper method definition like usual... ^^^ //
    
    // vvv We can do this instead... vvv //
    
    abstract void makeSound(); // <- Abstract methods don't have a BODY.
    // This abstract declaration will FORCE the inheriting classes to override this method.
    
    // !!! We can make ABSTRACT methods (taas) and REGULAR methods (baba) inside an ABSTRACT class. !!! //

    void showName() {
        System.out.println("Name: " + strName);
    }

    // Additional -> create a setter. 
    void setName(String strName) {
        this.strName = strName;
    } 

}

// Abstraction is an OOP technique that hides certain details and only shows important information.
// As you can see, we used the `abstract` keyword on the class declaration.
// That mean this is an ABSTRACT class.
// We make a GENERAL information abstract para hindi na natin sya i-instantiate. 
// In short, ih-hide na natin sya.
// Usage: Every time na may gusto tayong PILITING i-implement na method sa SUBCLASSES natin, we use abstraction.
// Gagawin lang nating abstract si superclass/general class.
// Abstraction can be achieved in two ways
//      1. Abstract Classes (Using `abstract` modifier).
//      2. Interfacese (Using `implements` keyword).