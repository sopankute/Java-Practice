
import java.util.*;
import java.util.stream.*;

public class ReverseStringArray{
  
  public void reverserEachStringInArray(String[] arr){
    
    int n = arr.length;
    
    // Using two for() and charAt() ------
    for(String e : arr){
      int l = e.length();
      
      for(int j=l-1; j>=0; j--){
        System.out.print(e.charAt(j));   // maertS, margorP, ipA, avaJ, noitcelloC, dapetoN,
      }
      System.out.print(", ");
    }
    
    System.out.println();
    
    // StringBuilder/StringBuffer
    for(int i=0; i<n; i++){
      System.out.print(new StringBuilder(arr[i]).reverse().toString()+", ");  // maertS, margorP, ipA, avaJ, noitcelloC, dapetoN
    }
    
    System.out.println();
    
    // Stream
    // map() and StringBuilder
    Arrays.stream(arr)
              .map(e-> new StringBuilder(e).reverse().toString())
              .forEach(s -> System.out.print(s+", "));  // maertS, margorP, ipA, avaJ, noitcelloC, dapetoN
    
    // map(), StringBuilder and List
    List<String> reversedList = Arrays.stream(arr)
              .map(e-> new StringBuilder(e).reverse().toString())
              collect(Collectors.toList());
    
    System.out.println(reversedList);
    
  }
  
  public static void main(String[] args){
    
    String[] strArray = {"Stream", "Program", "Api", "Java", "Collection", "Notepad"};
    
    ReverseStringArray obj = new ReverseStringArray();
    obj.reverserEachStringInArray(strArray);
  
  }

}