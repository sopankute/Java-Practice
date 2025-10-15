import java.util.*;

public class SortArray{

  public static void main(String[] args){
  
    int arr [] = {3, 3, 2, 6, 1, 6, 7, 8, 8, 7, 5};
    int n = arr.length;
    
    getSorted1(arr, n);
    getSorted2(arr, n);
  }
  
  // Using Double for()
  public static void getSorted1(int arr [], int n ){
    
      for(int i=0; i<n-1; i++){
        for(int j=i+1; j<n; j++){
          if(arr[i] < arr[j]){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
        }  
      }
      System.out.println("Sorted Arrya: "+Arrays.toString(arr));
  }
  
  // Using sort()
  public static void getSorted2(int arr [], int n ){
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
  }
  
  

}