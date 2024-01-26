package file.info;

import java.io.File;  

public class Main {  

    public static void main(String[] args) {  
        // Creating file object.
        File fMyFile = new File("data.txt");
 
        if (fMyFile.exists()) {
            // Getting file name.
            System.out.println("The name of the file is: " + fMyFile.getName());

            // Getting path of the file
            System.out.println("The absolute path of the file is: " + fMyFile.getAbsolutePath());

            // Checking whether the file is writable or not
            System.out.println("Is file writeable: " + fMyFile.canWrite());

            // Checking whether the file is readable or not  
            System.out.println("Is file readable: " + fMyFile.canRead());

            // Getting the length of the file in bytes  
            System.out.println("The size of the file in bytes is: " + fMyFile.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }

}