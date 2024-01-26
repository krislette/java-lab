package file.read;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        /*
         * The FileReader reads the contents of a file as a strem of characters.
         * One by one, read() method returns an integer value which contains the byte value.
         * When read() returns -1, there is no more data to be read.
         */
        try {
            FileReader frReader = new FileReader("art.txt");
            int intData = frReader.read();          // Returns the byte value of the first character.

            // We'll enclose .read() with a while loop so that,
            // it can read all characters present in the .txt file.
            // Important Note: Typecast from int to character to make it a readable text.
            // Important Note: Use print and not println because it will insert a new line for each character.
            while (intData != -1) {
                System.out.print((char) intData);
                intData = frReader.read();
            }

            // Closing the file reader is always crucial to avoid leak.
            frReader.close();
        } catch (IOException e) {
            // Whatever error this is expected to handle.
        }
    }

}