package polymowphism;

public class WeakEnemy extends Enemy {

    WeakEnemy() {
        // Adding default values in the constructor.
        strName = "Weak Enemy"; // <- accessing the global variable from ENEMY superclass.
        intHp = 10;
    }
    
    void displayDialogue() {
        System.out.println(strName + ": I'm weak.");
    }
    
}