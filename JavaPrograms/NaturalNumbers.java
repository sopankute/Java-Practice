package JavaPrograms;

import java.util.Scanner;


public class NaturalNumbers {
    public static void main(String[] args) {

// 1. Write a program to print all natural numbers from 1 to n
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int N = sc.nextInt();

        System.out.println("Natural numbers from 1 to "+N+":");
        for(int i=1; i<=N; i++){
            System.out.print(i+" ");
        }
        sc.close();


// 2. Write a program to print all natural numbers in reverse

        System.out.println("All Natural number in reverse Order from "+N+"to 1 :");
        for(int i=N; i>0; i--){
            System.out.print(i+" ");
        }


    }
}
