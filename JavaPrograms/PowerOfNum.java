package JavaPrograms;

import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        

// 14. Write a program to find the value of one number raised to the power of another

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base value : ");
        double base = sc.nextDouble();

        System.out.println("Enter exponent value : ");
        double exponent = sc.nextDouble();

        long result = 1;
        // double result = Math.pow((double)base, (double)exponent);

        for(int i=1; i<=exponent; i++){
            result *= base;
        }

        System.out.println(base+" raised to the power of "+exponent+" : "+result);

    }
}
