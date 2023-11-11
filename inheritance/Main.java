package inheritance;

public class Main {
    
    public static void main(String[] args) {
        Person p1 = new Person("Acelle", "Bading", 19);
        Toddler t1 = new Toddler("Krislette", "Street", 3, "Coding");
        Kid k1 = new Kid("Rosales", "Closeted", 8, "iDate", 3);
        
        // Instead of doign lines 6 to 8...
        // We can instantiate better using the superclass.
        // Person p1 = new Person("Acelle", "Bading", 19);
        // Person t1 = new Toddler("Krislette", "Street", 3, "Coding");
        // Person k1 = new Kid("Rosales", "Closeted", 8, "iDate", 3);
        
        // ^^^ The above code is what we call polymorphism ^^^ //
        
        
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
        k1.checkStatus();
    }

}

// Compile your package using * for efficiency. IM SO INTELLIGENT!
// Polymorphism uses INHERITANCE.