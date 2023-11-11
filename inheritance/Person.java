package inheritance;

public class Person {
    
    String strName, strSex;
    int intAge;

    // Kapag ayaw mo nang pilitin ka ng JVM to make constructors sa subclasses...
    // Make this empty constructor.
    // NOTE: Madalang lang gumamit ng explicit constructor and more no inherting attributes tayo.   
    Person() {
        // Explicit Constructor.
    }

    // Implicit Constructor // Kasi may arguments.
    Person(String strName, String strSex, int intAge) {
        this.strName = strName;
        this.strSex = strSex;
        this.intAge = intAge;
    }

    void checkStatus() {
        System.out.println("Name: " + strName);
        System.out.println("Sex: " + strSex);
        System.out.println("Age: " + intAge);
    }

}

// This is the SUPERCLASS. 