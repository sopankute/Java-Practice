

import java.util.*;

public class PairSum{
  
  public static void main(String[] args){
    
    int arr[] = {2, 3, 4, 5, 7, 8, 9};  // {1, 2, 3, 4, 5, 6, 7};
    int targetSum = 9;
    
    findPairForSum1(arr, targetSum);
    System.out.print("\n");
    findPairForSum1(arr, targetSum);
  }
  
  // Using Double for()
  public static void findPairForSum1(int[] arr, int targetSum){
    
    int n = arr.length;
    
    for(int i=0; i<=n/2; i++){
      for(int e: arr){
        if(arr[i] != e && arr[i]+e == targetSum){
          System.out.print("{"+arr[i]+","+e+"}  ");
        }
      }
    }
    
  }
  
  // Using while() and 2 pointer
  public static void findPairForSum2(int[] arr, int targetSum){
    
    int n = arr.length;
    int low = 0;
    int high = n-1;
    
    while(low<high){
      
      int sum = arr[low] + arr[high];
      
      if(arr[low] != arr[high] && sum == targetSum){
        System.out.print("{"+arr[low]+","+arr[high]+"}  ");
        low++;
        high--;
      }
      else if(sum < targetSum){
        low++;
      }
      else{
        high--;
      }
    }
  }
}