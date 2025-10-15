

import java.util.*;
import java.util.stream.*;

public class RemoveDuplicate{

  // Remove Duplicate from an Array

  public static void main(String[] args){
    
    int[] arr = {3, 3, 2, 6, 1, 6, 7, 8, 8, 7, 5};
    
    Set<Integer>  uniqueNumber = getUniqueNumber1(arr);
    System.out.print("Unique Numbers Set: "+uniqueNumber+"\n");
    
    List<Integer> uniqueNumberList = getUniqueNumber2(arr);
    System.out.print("Unique Numbers List: "+uniqueNumberList);
  }
  
  // Using Set
  public static Set<Integer> getUniqueNumber1(int[] arr){
    
    Set<Integer> uniqueNumberSet = new HashSet<>();
    
    for(int i=0; i<arr.length; i++){
      uniqueNumberSet.add(arr[i]);
    }
    
    return uniqueNumberSet;
  }
  
  // Using Stream
  public static List<Integer> getUniqueNumber2(int[] arr){
    
    List<Integer> uniqueNumberList = Arrays.stream(arr) // Convert int[] → IntStream
                .distinct()         
                .mapToObj(e -> e)   // int to Integer  -or-
              //  .boxed()            // int to Integer
                .collect(Collectors.toList());
    
    return uniqueNumberList;
  }
  
}