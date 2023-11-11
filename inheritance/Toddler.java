package inheritance;

public class Toddler extends Person {

    // Super constructor is efficient in terms of letting is declare NEW attributes for a subclass.
    String strFavoriteGame;
    
    // This is called OVERRIDING constructor.
    Toddler(String strName, String strSex, int intAge, String strFavoriteGame) {
        super(strName, strSex, intAge); // SUPER keyword for explicitly defining Toddler's constructor.
        // `super` is also a reference to the superclass' constructor.
        this.strFavoriteGame = strFavoriteGame;
    }

    void drink() {
        System.out.println("Drinking Milk.");   
    }

}

// This is the SUBCLASS. We use `extends` keyword in order to INHERIT.