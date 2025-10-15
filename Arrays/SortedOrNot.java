package Arrays;

public class SortedOrNot {
    
    public static void main(String[] args) {
        
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};    // {3, 3, 2, 6, 1, 6, 7, 8, 8, 7, 5};  

        int n = array.length;
        boolean isSorted = true;

        for(int i=1; i<n; i++){
            if (array[i] < array[i-1]) {    // 2>1|3>2| 
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is Sorted!!");
        }
        else{
            System.out.println("Array is Not Sorted!!");
        }
    }

}
