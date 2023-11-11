package abstwaction;

public interface LandAnimal {

    // !!! OPTIONAL !!! //
    // String strName = "Bird"; <- Wag gawin, but we can do this to declare a FINAL value.
    
    // Ilagay rito lahat ng kayang gawin ng land animal.
    void walk();

    // !!! OPTIONAL !!! //
    // Lahat ng AirAnimal pwedeng mag-say hello. Although, this is usually HINDI GINAGAWA.
    // Kapag gagamit ng ganito, mag-inheritance na lang kaysa interface.
    default void sayHello() {
        System.out.println("Hello");
    }

}

// Another INTERFACE.