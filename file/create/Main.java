package file.create;

import java.io.File;  
import java.io.IOException;   

public class Main {  
    public static void main(String args[]) {  
        try {
            File fNewFile = new File("create.txt"); 
  
            if (fNewFile.createNewFile()) {  
                System.out.println("File " + fNewFile.getName() + " is created successfully.");  
            } else {  
                System.out.println("File already exists in the directory.");  
            } 
        } catch (IOException e) {  
            System.out.println("An unexpected error is occurred.");  
            e.printStackTrace();  
        } 
    }
}