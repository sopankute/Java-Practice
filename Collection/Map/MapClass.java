package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapClass {
    public static void main(String[] args) {
        
        Map<Integer, String> cityMap = new HashMap<>();
        cityMap.put(21, "New York");
        cityMap.put(25, "Los Angeles");
        cityMap.put(37, "Chicago");
        cityMap.put(84, "Houston");
        cityMap.put(45, "San Francisco");
        cityMap.put(68, "Miami");
        cityMap.put(71, "Dallas");
        cityMap.put(98, "Seattle");
        cityMap.put(49, "Boston");
        cityMap.put(10, "Denver");

        // System.out.println(cityMap);
        
        // Keys
        Set<Integer> keys = cityMap.keySet();
        System.out.println("Keys : "+keys);         // [49, 98, 84, 68, 21, 37, 71, 25, 10, 45]


        // Values
        // Collection<String> values =cityMap.values();
        // System.out.println("Values : "+values);        // [Boston, Seattle, Houston, Miami, New York, Chicago, Dallas, Los Angeles, Denver, San Francisco]


        // Set<Map.Entry<Integer, String>> entries = cityMap.entrySet();
        // entries.forEach(e->System.out.println(e.getKey()+" : "+e.getValue()));

        // for(Map.Entry<Integer, String> entry : entries){
        //     System.out.println(entry.getKey()+" : "+entry.getValue());
        // }


        // cityMap.remove(84);
        
    
        // System.out.println(cityMap.get(84));                      // Houston
        // System.out.println(cityMap.getOrDefault(71, null));       // Dallas
        // System.out.println(cityMap.getOrDefault(131, null));      // null
        
        
        // System.out.println(cityMap.containsKey(49));                 // true
        // System.out.println(cityMap.containsKey(131));                // false
        // System.out.println(cityMap.containsValue("Houston"));     // true
        
        System.out.println(cityMap);
    }
}
