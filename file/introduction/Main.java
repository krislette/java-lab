package file.introduction;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // This is how we get a file in Java.
        File fSecret = new File("secret.txt");

        // Here are some methods for Java file handling.
        // .exists() is used to check if the file really does exist.
        if (fSecret.exists()) {
            System.out.println("File exists.");
            System.out.println(fSecret.getPath());              // Gets the pathname and converts it to string.
            System.out.println(fSecret.getAbsolutePath());      // Gets the full path to the file directory.
            System.out.println(fSecret.isFile());               // Checks if the file is an actual and not a folder, etc.
            // fSecret.delete();                                // This will delete the file in the folder.
        } else {
            System.out.println("File doesn't exist.");
        }
    }

}