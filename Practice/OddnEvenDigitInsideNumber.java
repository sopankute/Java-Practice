package Practice;

public class OddnEvenDigitInsideNumber {
    public static void main(String[] args) {
        
        int number = 123456789;
        int oddCount=0;
        int evenCount = 0; 

        while (number>0) {
            int digit = number%10;
            if (digit%2 == 0) 
                evenCount++;
            else
                oddCount++;
            
            number = number / 10;
        }
        System.out.println(" Even Digit : "+evenCount+"\n Odd Digit : "+oddCount);

    }
}
