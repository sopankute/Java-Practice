package Practice;

public class MaxnMinOfArray {
    public static void main(String[] args) {
        
        int[] arr = {3,5,6,7,45,0,9,2,6,3,1};

        int max = arr[0];
        int min = arr[0];

        for (int e : arr) {
            if (e>max) {
                max = e;
            }
            if(e<min){
                min = e;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
