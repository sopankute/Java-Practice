package Practice;

public class SumOfArrayElements {

    public static void main(String[] args) {
        
        int[] arr = {3,5,6,7,9,2,6,3,1};
        int sum=0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }
}
