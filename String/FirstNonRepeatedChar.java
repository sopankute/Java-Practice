
import java.util.*;

public class FirstNonRepeatedChar{
  
  public void nonRepeatedChar(String str){
    
    // without collection - two for()
    
    for(int i=0; i<str.length(); i++){
      
      boolean unique = true;
      
      for(int j=0; j<str.length(); j++){
        if(i!=j && str.charAt(i)==str.charAt(j)){
          unique = false;
          break;
        }
      }
      
      if(unique){
        System.out.println(str.charAt(i));
        break;
      }
    }
    
    // Using LinkedHashMap
    Map<Character, Integer> map = new LinkedHashMap<>();
    
    for(char ch : str.toCharArray()){
      map.put(ch, map.getOrDefault(ch, 0)+1); 
    }
    
    for(Map.Entry<Character, Integer> entry : map.entrySet()){
      if(entry.getValue() == 1){
        System.out.println(entry.getKey());
      }
    }
    
    System.out.println(map);

  }
  
  public static void main(String[] args){
    
    String str = "Collection";    // e
    // String str = "hello";      // h
    
    FirstNonRepeatedChar obj = new FirstNonRepeatedChar();
    obj.nonRepeatedChar(str.toLowerCase());
  }
}