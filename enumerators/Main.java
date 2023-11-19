package enumerators;

// Declaring an enumerator like this is not recommended:
// enum AILevel {
//     EASY,
//     MEDIUM,
//     HARD;
// }

public class Main {
    
    public static void main(String[] args) {
        // ENUM Syntax:
        // EnumName variableName = EnumName.FIELD;

        // ENUMS are mostly used on CONDITIONAL statements.
        AILevel enumLevel = AILevel.HARD;
        System.out.println(enumLevel);

        if (enumLevel.equals(AILevel.EASY)) {
            System.out.println("The level is easy.");
        } else if (enumLevel.equals(AILevel.MEDIUM)) {
            System.out.println("The level is medium.");
        } else if (enumLevel.equals(AILevel.HARD)) {
            System.out.println("The level is hard.");
        }
        
        switch(enumLevel) {
            case EASY: {
                System.out.println("The level is easy.");
                break;
            }
            case MEDIUM: {
                System.out.println("The level is medium.");
                break;
            }
            case HARD: {
                System.out.println("The level is hard.");
                break;
            }
        }
    } 

}