package JavaPrograms;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        
// 15. write a program to reverse the given Digits

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : "); 

        int num = sc.nextInt();

        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;

            reverse = reverse * 10 + digit;

            num = num / 10;
        }

        System.out.println("Reversed number is: "+reverse);

    }
}
