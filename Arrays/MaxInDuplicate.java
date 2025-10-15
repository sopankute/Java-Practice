package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MaxInDuplicate {

    // find max number from duplicate elements  

    public static void main(String[] args) {
        
        int arr[] = {42, 67, 21, 42, 89, 21, 83, 39, 11, 45, 74, 83, 53};

        int max = arr[0];

        for(int i=0; i<arr.length; i++){            // 4 
            for(int j=i+1; j<arr.length; j++){      // 6 2 4
                if (arr[i] == arr[j]) {             // 4==6|4==2|4==4
                    if (arr[i] > max){
                        max=arr[i];
                        System.out.println("Max Element: "+max);
                    }
                    break;
                }
            }
        }
    

        // List<Integer> list = new ArrayList<>(Arrays.asList(4, 6, 2, 4, 8, 2, 8, 9, 1, 5, 7, 3, 3));



        int arr1[] = {42, 67, 21, 42, 89, 21, 83, 39, 11, 45, 74, 83, 53};

        Map<Integer, Integer> map = new HashMap<>();

        int count = 1;

        for(int i=0; i<arr1.length; i++){
            map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);       // 42, 67, 21, 42-count+1
        }

        Integer max1 = arr1[0];

        for (Map.Entry<Integer, Integer> e: map.entrySet()) {
            if (e.getValue() > 1) {
                System.out.print("  "+e.getKey());     // 83 21 42
                max1 = Math.max(max1, e.getKey());
            }   
        }
        System.out.println("\nMax Element: "+max1);

    }
}
