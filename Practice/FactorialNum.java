package Practice;

public class FactorialNum {
    public static void main(String[] args) {
        
        int num = 6;    // 5*4*3*2*1
        int factorial = 1;

        for (int i = num; i>=1; i--) {
            factorial *= i; 
        }

        System.out.println(factorial);
    }
}
