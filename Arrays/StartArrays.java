package Arrays;

import java.util.*;
import java.util.stream.Stream;

public class StartArrays {
    public static void main(String[] args) {
        
        // {3, 3, 2, 6, 1, 6, 7, 8, 8, 7, 5};

        int[] arr = {3, 3, 2, 6, 1, 6, 7, 8, 8, 7, 5};

        String[] strArray = {"Aarav", "Vihaan", "Ishaan", "Arjun", "Reyansh", "Aditya", "Krishna", "Rohan", "Saanvi", "Diya",
            "Anaya", "Navya", "Aadhya", "Meera", "Ira"};
        
        // Using For Loop
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i]+" ");   
        }
        
        System.out.println();
        
        // Using forEach()
        for (String e : strArray) {
            System.out.print(e+" ");
        }
        
        System.out.println("\n");
        
        Stream.of(strArray).forEach(str->System.out.print(str+" "));
        
        // Reverse Order
        System.out.println("\nReverse Order");
        int n = strArray.length;
        for(int i=n-1; i>0; i--){
          System.out.print(strArray[i]+" ");
        }
        
        // Merge Two Arrays
        int[] arr1 = {3, 3, 2, 6, 1};     // 5
        int[] arr2 = {6, 7, 8, 8, 7, 5};  // 6
        
        int n1 = arr1.length;
        int n2 = arr2.length;
        
        int[] mergedArray = new int[n1+n2]; // 11
        int l = mergedArray.length;
        
        System.out.println("\n");
        
        for(int i=0; i<n1; i++){   // 0-10
          mergedArray[i] = arr1[i];   // 0, 1, 2, 3, 4 | n1=5
        }
        
        for(int i=0; i<n2; i++){   // 0-10
          mergedArray[i+n1] = arr2[i];   // 0, 1, 2, 3, 4 | n1=5
        }
        
        System.out.println(Arrays.toString(mergedArray)); // [3, 3, 2, 6, 1, 6, 7, 8, 8, 7, 5]
        
        Arrays.stream(mergedArray).forEach(e1->System.out.print(e1+" ")); // 3 3 2 6 1 6 7 8 8 7 5
    }
}
