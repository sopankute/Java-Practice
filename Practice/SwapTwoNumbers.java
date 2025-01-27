package Practice;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        
       
        int a = 3, b = 5;
        System.out.println("Before Swapping : a="+a+" | b="+b);
        
        // 1 - Using 3rd Variable
        // int temp = a;
        // a = b;
        // b = temp;
    
        // 2 - Without 3rd Variable
        // a = a + b;
        // b = a - b;
        // a = a - b;

        // 3 - Using '*' & '/'  (variable !=0)
        // a = a * b;
        // b = a / b;
        // a = a / b;

        // 4 - XOR operator
        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;

        // 5 - Single Statement
        // b = a + b - (a = b);


        System.out.println("After Swapping : a="+a+" | b="+b);
    }
}
