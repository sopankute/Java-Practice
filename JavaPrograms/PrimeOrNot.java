package JavaPrograms;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {

// 17. write a program to Check Whether a Given Number is Prime or Not

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = sc.nextInt();
        
        int count = 0;
        // boolean flag = false;
        for(int i=1; i<=number; i++){
            if(number % i == 0){
                // flag = true
                count++;
            }
        }

        if(count == 2){
            System.out.println("Prime Number.");
        }else{
            System.out.println("Not Prime Number.");
        }
    }   
}
