package Practice;

public class SumOfDigitOfNumber {
    public static void main(String[] args) {

        int num = 876543;

        int sum = 0;

        while (num > 0) {

            int digit = num % 10;
            System.out.print(digit + " ");
            num = num / 10;

            sum += digit;
        }
        System.out.println("The Sum of Digit : " + sum);
    }
}
