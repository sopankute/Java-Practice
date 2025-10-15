package JavaPrograms;

import java.util.Scanner;

public class FindAssciiValue {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter character to find ASCII value : ");
        char character = sc.next().charAt(0);

            if(character == 0){
                System.out.println("Exited...");
                break;
            }

        }

        

        int ASCII = (int)character;
        
        System.out.println("ASCII value for "+character+" :"+ASCII);

    }
}
