package file.scan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadFromFile {
    public static void main(String[] args) {
        try {
            // Create fReader object of the file to read data  
            File fReader = new File("art.txt");
            Scanner input = new Scanner(fReader);

            while (input.hasNextLine()) {
                String strFileData = input.nextLine();
                System.out.println(strFileData);
            }

            input.close();  
        } catch (FileNotFoundException exception) {
            System.out.println("Unexcpected error occurred!");
            exception.printStackTrace();
        }
    }
}