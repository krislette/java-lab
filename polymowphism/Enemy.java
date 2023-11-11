package polymowphism;

public class Enemy {

    String strName;
    int intHp;
    
    void displayDialogue() {
        System.out.println("Overridable Method.");
    }

    void showStats() {
        System.out.println("Name: " + strName);
        System.out.println("HP: " + intHp);
    }

}

// Superclass.