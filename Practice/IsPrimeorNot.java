package Practice;

import java.util.Scanner;

public class IsPrimeorNot {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");

        int num = sc.nextInt();           // 9%
        int count = 0;

        if(num>1){
            for (int i = 1; i <= num; i++) {      
                if(num % i ==0){
                    count++;
                }
            }
            if(count==2)
                System.out.println("Prime");
            else 
                System.out.println("Not Prime");
        }else
            System.out.println("Not Prime");

    }
}
