package oop1Constructor;

public class Character {
    
    String strName, strDialog;
    int intHp, intMp, intLvl;

    // A CONSTRUCTOR (yung tinatawag kapag nagi-instantiate tayo) is considered as an OBJECT METHOD.
    // Note: MINSAN lang mawalan ng constructor ang isang object.
    Character(String strName, String strDialog, int intHp, int intMp, int intLvl) {
        this.strName = strName;
        this.strDialog = strDialog;
        this.intHp = intHp;
        this.intMp = intMp;
        this.intLvl = intLvl;
    }

    public void printIntroduction() {
        System.out.println("I am " + strName);
    }    

    public void sayDialog() {
        System.out.println(strName + ": " + strDialog);
    }

    public void talkTo(String strFirstName) {
        System.out.println(strName + ": Hello, " + strFirstName);
    } 
     
}
