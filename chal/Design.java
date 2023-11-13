package chal;

public class Design {
    
    /* I made this because it is a part of my system now.
     * It prints a nice divider to make the code neater!
     */
    public void displayDesign(int intNumber) {
        for (int i = 0; i < intNumber - 1; i++) {
            System.out.print("-");
        }
        System.out.println("-");
    }

}