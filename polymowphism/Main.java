package polymowphism;

public class Main {
    
    public static void main(String[] args) {
        // Polymorphism!
        Enemy e1 = new WeakEnemy();
        Enemy e2 = new StrongEnemy();

        e1.displayDialogue();
        e1.showStats();

        e2.displayDialogue();
        e2.showStats();

        Enemy e3 = new StrongEnemy("Bading");
        e3.displayDialogue();
        e3.showStats();
    }

}

// Another example for polymorphism.