package IOFileHandling;

import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandlingDemo {
    public static void main(String[] args) {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        System.out.println("ENter input : ");
        try {
            int userInput = isr.read();     // work like scanner
            
            while(isr.ready()){
                System.out.println((char)userInput);
                userInput = isr.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
