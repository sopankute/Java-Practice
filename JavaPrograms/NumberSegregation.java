package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class NumberSegregation {
    public static void main(String[] args) throws Exception{
        
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  // to read '-' sign use Scanner

        Scanner reader = new Scanner(System.in);

        char choice;

        do{
            System.out.print("Enter number : ");
            String input = reader.nextLine();
            if (input == null) {
                System.err.println("Please enter correct number.");
            }
            int num1 = Integer.parseInt(input);    

            if(num1 > 0){
                positiveCount++;
            }else if (num1 < 0) {
                negativeCount++;
            }else {
                zeroCount++;
            }

            System.out.println("Do you want to enter another number? (y/n):");
            choice = reader.nextLine().charAt(0);

        }while(choice=='y');

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);

    }
}
