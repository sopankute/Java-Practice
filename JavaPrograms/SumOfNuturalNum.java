package JavaPrograms;

import java.util.Scanner;

public class SumOfNuturalNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number to find sum till Number : ");
        int N = sc.nextInt();

        int sum = 0;

        for(int i=1; i<=N; i++){
            sum += i;
            System.out.print(" "+i);
        }

        System.out.println("\nSum of Number : "+sum);
    }   
}
