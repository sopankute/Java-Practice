package Practice;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int org = num;
        int x = 0;
        while (num != 0) {
            x = x*10 + num%10;
            num = num/10;
        }

        if (org == x) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println(" Not Palindrome Number");
        }


        sc.close();
    }
}
