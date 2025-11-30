
import java.util.*;

public class ReplaceCharWithOccurrence{
  
  public void replaceCharOccurrence(String str){
    
    int n = str.length();
    
    char chToReplace = 'g';
    
    if(str.indexOf(chToReplace) == -1){
      System.out.println("Given Character Not Available in String.");
    }
    
    char [] arr = str.toCharArray();
    
    int count = 1;
    for(int i=0; i<n; i++){   // p r o g r a m i n g g
      if(arr[i] == chToReplace){  // p==g|r==g|o==g|g==g|r==g|a==g|m==g|i==g|n==g|g==g|g==g|
        arr[i] = String.valueOf(count).charAt(0); // int-> String -> char at(0) | 1, 2, 3
        count++;
      }
    }
    
    System.out.println("Replaced Char with Occurence: "+Arrays.toString(arr));  
    // [p, r, o, 1, r, a, m, m, i, n, 2, 3]
  }
  
  public static void main(String[] args){
    
    String str = "programmingg";
    ReplaceCharWithOccurrence obj = new ReplaceCharWithOccurrence();
    obj.replaceCharOccurrence(str);
  }
}