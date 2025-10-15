package Arrays;

public class LargestElement {

    public static void SecLargest(){
        int[] arr = {2,3,1,7,4,7,5};

        int largest = arr[0];
        int sLargest = -1;

        for(int i=0; i<arr.length; i++){

            if(arr[i]>largest){     // 2>2 & 2>-1 | 3>2 &  
                largest = arr[i];
                if (arr[i]>sLargest && arr[i]!=largest) {
                    sLargest = arr[i];
                }
            }
        }
        System.out.println(sLargest);
        System.out.println(largest);
    }
    public static void main(String[] args) {
        
        SecLargest();

        int [] arr = {3,2,1,5,3,6,7,1};

        // Largest  O(n)
        int largest = arr[0];
        for(int i=1; i<arr.length; i++){
            if (arr[i] > largest) { // 2>3 f | 1>3 f | 5>3 T | 3>5 f | 6>5 T | 7>6 T | 1>7 f
                largest = arr[i];       // largest = 5, 6, 7
            }
        }
        System.out.println(largest);    // 7

        // Second Largest  O(2n)
        int sLargest = -1;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>sLargest && arr[i] != largest) { 
                sLargest = arr[i];
            }
        }
        System.out.println(sLargest);
    }
}
