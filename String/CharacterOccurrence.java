
import java.util.*;

public class CharacterOccurrence{
  
  public void charOccurrence(String str){
    
    Map<Character, Integer> map = new HashMap<>();
    
    char[] array = str.toCharArray();
     
    for(char ch : array){
      if(!map.containsKey(ch)){
        map.put(ch, 1);
      }
      else{
        map.put(ch, map.getOrDefault(ch, 0) + 1);
      }
    }
    
    for(Map.Entry<Character, Integer> entry : map.entrySet()){
      System.out.print(entry.getKey()+":"+entry.getValue()+", ");   // c:2, t:1, e:1, i:1, l:2, n:1, o:2,
    }
    
  }
  
  public static void main(String[] args){
    
    //String str = "Collection";
    String str = "hello";
    
    CharacterOccurrence obj = new CharacterOccurrence();
    obj.charOccurrence(str.toLowerCase());
  }
}