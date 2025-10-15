
import java.util.*;
import java.util.stream.*;

public class UniqueStringAshokIT{

  public void removeDuplicate(){
    
    String str = "programming";
    
    // java 8
      StringBuilder sb1 = new StringBuilder();
      str.chars().distinct().mapToObj(e -> (char)e).forEach(c -> sb1.append(c));
      System.out.println(sb1);  // progamin
   
    // indexOf()
      int l = str.length();
      StringBuilder sb2 = new StringBuilder();
      
      for(int i=0; i<l; i++){
        char ch = str.charAt(i);
        int idx = str.indexOf(ch, i+1);       // search 1st 'ch' in String from index 'i+1'
        
        if(idx == -1){
          sb2.append(ch);
        }
      }
      System.out.println(sb2);
    
    // char array
      char[] charString = str.toCharArray();
      int n1 = charString.length;
      
      StringBuilder sb3 = new StringBuilder();
      
      for(int i=0; i<n1; i++){
        
        boolean flag = false;
        for(int j=i+1; j<n1; j++){
          if(charString[i] == charString[j]){
            flag = true;
          }
        }
        
        if(!flag){
          sb3.append(charString[i]);
        }
      }
      
    
    // Set
    StringBuilder sb4 = new StringBuilder();
    
    Set<Character> set = new HashSet<>();
    for(int i=0; i< n1; i++){
      set.add(str.charAt(i));
    }
    for(Character c : set){
      sb4.append(c);
    }
    System.out.print(sb4);
  }

  public void getAvgofString(){
    
    
    String[] str = {"Java", "Stream", "Api", "Lambda", "Code" };
    
    Double  avg = Arrays.stream(str).collect(Collectors.averagingDouble(String::length));
    
    System.out.print(avg);
  }



  public static void main(String[] args){
    UniqueStringAshokIT obj = new UniqueStringAshokIT();
    obj.removeDuplicate();
    
    System.out.println();
    obj.getAvgofString();
  }
}