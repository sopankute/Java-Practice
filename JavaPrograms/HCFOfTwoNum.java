package JavaPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HCFOfTwoNum {
    public static void main(String[] args) throws Exception{
        
// 18. Write a program to calculate HCF of Two given number

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first number : ");
        int num1 = Integer.parseInt(reader.readLine());
        
        System.out.print("Enter second number : ");
        int num2 = Integer.parseInt(reader.readLine());

        int hcf = 1;
        int min = (num1 < num2)? num1 : num2;
        
        int i=1;

        while (i <= min){
            if ((num1 % i == 0) && (num2 % i==0)) {
                hcf = i;
            }
            i++;
        }
        
        System.out.println("HCFOfTwoNum.main() | HCF : "+hcf);
        
        reader.close();
    }
}
