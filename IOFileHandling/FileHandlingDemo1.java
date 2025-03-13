package IOFileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo1 {

    public static void fileIOOperation() throws IOException{
        File file = new File("abc.txt");

        System.out.println(file.exists());
        
        FileReader fr = new FileReader(file);
        // FileWriter fw = new FileWriter(file);
        // fw.write("happy rose day");

        int c = fr.read();
        while (fr.ready()) {
            System.out.print((char)c);   // a happy rose da 
            c = fr.read();
        }

        // fw.close();
        fr.close();
    }

    public static void main(String[] args) throws IOException {

        fileIOOperation();
    }
}
