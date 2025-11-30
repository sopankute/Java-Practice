
import java.util.*;

public class SortStringChar{

  public void staticortCharAlphabetical(String str){
    
    // without sort()
    
    char[] arr = str.toCharArray();
    int n = arr.length;
    
    for(int i=0; i<n; i++){
      for(int j=i+1; j<n; j++){
        //if(arr[i]>arr[j]){
        //  char temp = arr[i];
        //  arr[i] = arr[j];
        //  arr[j] = temp;
        // }
      }
    }
    //System.out.println(new String(arr));
    
    // sort()
    Arrays.sort(arr);
    System.out.println(new String(arr));
  }

  
  public static void main(String[] args){
    
    // String str = "Rock";  // sorted = Rcko
    String str = "java";  // sorted = aajv
    
    SortStringChar obj = new SortStringChar();
    obj.staticortCharAlphabetical(str);
  }

}