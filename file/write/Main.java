package file.write;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        /*
         * FileWriter methods:
         * .write() lets us write a string into the file.
         * .append() lets us add a string but, at the end of the file.
         * .close() is a standard procedure, to avoid leak, we should always close our files. 
         */

        // So... a filewriter creates a file for us,
        // and let's us write things in it.
        try {
            FileWriter fwWriter = new FileWriter("poem.txt");
            fwWriter.write("Esophagus esophagus\nHabang tayo'y kumakain sa hapagkainan\nSiyempre, hindi mawawala ang iyong\nesophagus~");
            fwWriter.append("\n: by Sinapupunan");
            fwWriter.close();
        } catch (IOException e) {
            // Here goes whatever error may come on our way...
        }
    }

}