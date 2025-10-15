
import java.util.*;
import java.util.stream.*;

public class ReverseStringAshokIT{

  public void reverseString(){
    
    // using toCharArray()
      String str = "hello";
      
      char[] charString = str.toCharArray();
      int n = str.length();
      
      for(int i=n-1; i>=0; i--){
        System.out.print(charString[i]);
      }
    
      System.out.println();
      
    // charAt(int index)
      for(int i=n-1; i>=0; i--){
        System.out.print(str.charAt(i));
      }
    
      System.out.println();
    
    // StringBuffer and StringBuilder reverse()
      StringBuffer sb1 = new StringBuffer(str);
      sb1.reverse();
      System.out.println(sb1);
      
      StringBuilder sb2 = new StringBuilder(str);
      sb2.reverse();
      System.out.println(sb2);
      
    // 1. Stream
      String reverseString1 = Stream.of(str)
            .map(e-> new StringBuffer(e).reverse().toString())
            .collect(Collectors.joining());
            
      System.out.println(reverseString1);
      
    // 2.
      String reverseString2 = str.chars()
          .mapToObj(e-> String.valueOf((char)e))
          .reduce("", (a, b)-> b+a);
    
      System.out.println(reverseString2);
      
    // 3. 
      String reverseString3 = str.chars().mapToObj(c -> (char)c)
                .collect(Collectors.collectingAndThen(
                  Collectors.toList(),
                  list -> {
                    Collections.reverse(list);
                    return list.stream()
                              .map(String::valueOf)
                              .collect(Collectors.joining());
                  }
                ));
      System.out.println(reverseString3);        
  }
  public static void main(String[] args){
    ReverseStringAshokIT obj = new ReverseStringAshokIT();
    obj.reverseString();
  }
}