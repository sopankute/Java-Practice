package Arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueFromArray {

    public static void main(String[] args) {
        
        int [] arr =  {1, 1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 7, 8};     // {3, 3, 2, 6, 1, 6, 7, 8, 8, 7, 5};  // 
        
        int n = arr.length;

        Set<Integer> uniqueFromArray = new LinkedHashSet<>();   // [3, 2, 6, 1, 7, 8, 5]
    
        // Using Set
        for(int i=0; i<n; i++){
            uniqueFromArray.add(arr[i]);
        }
        // System.out.println("Unique Elements : "+uniqueFromArray);


    }
    
}
