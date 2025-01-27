package Practice;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int x = sc.nextInt();
        
        // 1 - using Algorithm
        // int rev = 0;
        // while(x !=0){
        //     rev = rev*10 + x%10;
        //     x = x/10;
        // }

        // 2 - StringBuffer

        // StringBuffer sb = new StringBuffer(String.valueOf(x));
        // StringBuffer rev = sb.reverse();

        // 3 - StringBuilders
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        StringBuilder rev = sb.reverse();

        System.out.println("Reverse Number : "+rev);

        sc.close();
    }
}
