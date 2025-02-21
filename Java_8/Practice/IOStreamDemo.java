package Java_8.Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IOStreamDemo {

    public static void main(String[] args) throws IOException {
        
        // File file = new File("Java_8/Practice/info.txt");
        // FileReader fr = new FileReader(file);
        // try (BufferedReader br = new BufferedReader(fr)) {
            
        //     String line = br.readLine();
        //     while (line != null) {
        //         System.out.println(line);
        //         line = br.readLine();
        //     }
        // }


        // IO Stream

        String file = "info.txt";

        // List<String> line = new ArrayList<>();

        try(Stream<String> stream = Files.lines(Paths.get(file))){
            stream.forEach(e->System.out.println(e));
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
