package abstwaction;

public interface Animal {
    
    void makeSound(); // By default, this will be PUBLIC. 
    // That's why, we have to make the succeeding makeSound methods as PUBLIC.

}

// Here, we are implementing an INTERFACE instead of a SUPERCLASS.
// Lahat ng id-declare sa isang interface, automatic ABSTRACT na.