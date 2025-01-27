package Practice;

public class CountDigit {
    public static void main(String[] args) {
        
        int number = 632347765;
        int countDigit = 0;
        System.out.print("No of Digit in "+number);
        while (number!=0) {
            number = number/10;
            countDigit++;
        }
        System.out.println(" : "+countDigit);
    }
}
