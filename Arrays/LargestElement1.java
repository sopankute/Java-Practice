package Arrays;

public class LargestElement1 {

    public static void secondLargest(int [] arr, int  l){

        // {3, 2, 6, 1, 6, 7, 8, 7, 5}

        int largest =  arr[0];
        int secLargest = -1;

        for(int i=1; i<l; i++){
            if (arr[i] > largest) {  
                secLargest = largest;   
                largest = arr[i];      
            }
            // else if(arr[i]<largest && arr[i]>secLargest){
            //       secLargest = arr[i];  
            // }
        }
        System.out.println("Largest : "+largest+" | Second Largest : "+secLargest);
    }


    public static void main(String[] args) {
        
        int [] array = {3, 3, 2, 6, 1, 6, 7, 8, 8, 7, 5};

        int n = array.length;
        secondLargest(array, n);

        int largest =  array[0];
        int secLargest = -1;

        for(int i=1; i<n; i++){ 
            if(array[i] > largest ){
                largest = array[i];
            }

            if(array[i] > secLargest && array[i] < largest){
                secLargest = array[i];
            }
        }
        // System.out.println("Largest Element from an Arrya: "+largest);

        // for(int i=0; i<n; i++){
        //     if(array[i] > secLargest && array[i] < largest){
        //         secLargest = array[i];
        //     }
        // }
        // System.out.println("Second Largest Element from an Arrya: "+secLargest);
    }
}
