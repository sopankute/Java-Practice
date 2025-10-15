package JavaPrograms;

import java.util.Scanner;

public class PrintTables {
    public static void main(String[] args) {
        
// 3. Write a program to print tables

        Scanner sc = new Scanner(System.in);

        System.out.print("Table for Number : ");
        int N = sc.nextInt();

        System.out.println("\nPrint table : ");
        for(int i=1; i<=10; i++){
            System.out.println(N+" * "+i+" = "+N*i);
        }
        
// 4. Write a program to print reverse tables
        
        System.out.println("\nPrint table in Reverse: ");
        for(int i=10; i>0; i--){
            System.out.println(N+" * "+i+" = "+ N*i);
        }
        sc.close();
    }
}
