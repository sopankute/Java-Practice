package Map;

import java.util.HashMap;

import java.util.Map.Entry;
import java.util.Set;

public class LInkedHashMapClass {

public static void main(String[] args) {
    
    // LinkedHashMap<String, Integer> map = new LinkedHashMap<>(11, 0.5f, true);
    HashMap<String, Integer> map = new HashMap<>();
    map.put("Orange", 80);
    map.put("Apple", 30);
    map.put("Pomogranate", 60);
    map.put("Banan", 50);

    // map.get("Pomogranate");
    // map.get("Orange");
    // map.get("Apple");
    
    Set<Entry<String, Integer>> entries = map.entrySet();
    for (Entry<String,Integer> entry : entries) {
        System.out.println(entry.getKey()+"\t"+entry.getValue());
    }


    }   
}
