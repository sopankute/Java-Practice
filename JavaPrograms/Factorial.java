package JavaPrograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
// 13. Write a program to find the factorial value of any number

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");        

        int num = sc.nextInt();

        int factorial = 1;

        for(int i=1; i<=num; i++){
            factorial *= i;
        }

        System.out.println("Factorial of num is : "+factorial);

    }    
}
