package enumerators;

// Declaring an enumerator like this is not recommended:
// enum AILevel {
//     EASY,
//     MEDIUM,
//     HARD;
// }

public class Main {
    
    public static void main(String[] args) {
        // Enumerators represent things using WORDS.
        // And we can put a value inside a WORD.

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

        USCurrency enumMoney = USCurrency.PENNY;
        System.out.println(enumMoney.getValue());

        USCurrency enumCoins[] = new USCurrency[4];

        for (int i = 0; i < enumCoins.length; i++) {
            enumCoins[i] = USCurrency.values()[i]; // <- STUDY THIS MORE!!!
            System.out.println(enumCoins[i]);
        }
    }

}