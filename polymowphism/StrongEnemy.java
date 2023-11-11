package polymowphism;

public class StrongEnemy extends Enemy {

    StrongEnemy() {
        // Adding default values in the constructor.
        strName = "Strong Enemy"; // <- accessing the global variable from ENEMY superclass.
        intHp = 100;
    }

    // Implement overloading constructor (example from overloading folder).
    StrongEnemy(String strName) {
        this.strName = strName;
        intHp = 100; // No more `this` keyword for default values.
    }

    void displayDialogue() {
        System.out.println(strName + ": I'm stronk.");
    }
    
}