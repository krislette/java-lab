package inheritance;

public class Main {
    
    public static void main(String[] args) {
        Person p1 = new Person();
        Toddler t1 = new Toddler();
        
        p1.strName = "Acelle";
        p1.strSex = "Bading";
        p1.intAge = 19;

        t1.strName = "Krislette";
        t1.strSex = "Street";
        t1.intAge = 3;

        p1.checkStatus();
        t1.checkStatus();
    }

}

// Compile your package using * for efficiency. IM SO INTELLIGENT!