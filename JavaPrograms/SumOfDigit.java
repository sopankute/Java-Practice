package JavaPrograms;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        
// 16. write a program to sum of its Digits

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = sc.nextInt();

        int sum = 0;

        while (number !=0) {
            int digit = number % 10;

            sum += digit;

            number = number / 10;
        }
        System.out.println("Sum of Digit : "+sum);
    }
}
