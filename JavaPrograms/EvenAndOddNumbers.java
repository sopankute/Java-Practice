package JavaPrograms;

import java.util.Scanner;

public class EvenAndOddNumbers {
    
    public static void main(String[] args) {
        
// 7. Write a program to print all even and odd numbers between 1 to 100   
// 10. Write a program to find sum of all even numbers between 1 to n    

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number till have to print even and odd : ");
        int N = sc.nextInt();

        int evenSum = 0;

        System.out.println("Printing Even :");
        for(int i=1; i<=N; i++){
            if(i % 2 == 0){
                // System.out.print(" "+i);
                evenSum += i;
            }
        }

// 8. Write a program to print all odd number between 1 to 100
// 11. Write a program to find sum of all odd numbers between 1 to n

        int oddSum = 0;

        System.out.println("\nPrinting Odd :");
        for(int i=1; i<=N; i++){
            if(i % 2 != 0){
                // System.out.print(" "+i);
                oddSum += i;
            }
        }

        System.out.println("Sum of All Even : "+evenSum+" and Odd : "+oddSum);

    }
}
