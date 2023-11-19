package enumerators;

public enum USCurrency {
    
    PENNY(0.01, "Penny"),
    NICKEL(0.05, "Nickel"),
    DIME(0.1, "Dime"),
    QUARTER(0.25);

    private double dblValue;
    private String strName;

    // I tried using a public A.M. but it throws an error and so...
    // I declared the constructor as private.    
    private USCurrency(double dblValue) {
        this.dblValue = dblValue;
    }
    
    // Overloaded the constructor.
    private USCurrency(double dblValue, String strName) {
        this.dblValue = dblValue;
        this.strName = strName;
    }

    // I have realized that...
    // What's the purpose of creating contant values if others can change them?
    // That's why I made the value private and I made a getter for it.
    public double getValue() {
        return dblValue;
    }
    
    // <NO SETTER>

}