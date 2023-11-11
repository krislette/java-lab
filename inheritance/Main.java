package inheritance;

public class Main {
    
    public static void main(String[] args) {
        Person p1 = new Person("Acelle", "Bading", 19);
        Toddler t1 = new Toddler("Krislette", "Street", 3, "Coding");
        
        // p1.strName = "Acelle";
        // p1.strSex = "Bading";
        // p1.intAge = 19;

        // t1.strName = "Krislette";
        // t1.strSex = "Street";
        // t1.intAge = 3;

        p1.checkStatus();
        t1.checkStatus();

        // p1.drink(); <- No such method for Person superclass.
        t1.drink();

        // p1.strFavoriteGame; <- No such attribute for Person superclass.
        System.out.println(t1.strFavoriteGame);
    }

}

// Compile your package using * for efficiency. IM SO INTELLIGENT!
// Polymorphism uses INHERITANCE.