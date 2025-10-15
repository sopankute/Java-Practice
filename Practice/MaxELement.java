package Practice;

public class MaxELement {

    public static void main(String[] args) {
        
        int [] arr = {56,23,78,23,93,92,28,62};

        // int max = 0;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]>max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println(max);

        for(int i=0; i<arr.length/2; i++){

            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        for (int i : arr) {
            System.out.print("  "+i);
        }
    }
}   
