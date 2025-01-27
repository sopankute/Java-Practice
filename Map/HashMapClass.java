package Map;


import java.util.HashMap;
import java.util.LinkedHashMap;



public class HashMapClass {

    // put(), get(), containsKey(), containsValue(), keySet(), entrySet(), remove(), size(), isEmpty(), getOrDefault()

    public static void main(String[] args) {
     
        // Map<Integer, String> map = new TreeMap<>();
        // HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, String> map = new LinkedHashMap<>();
        
        map.put(33, "Nagpur");
        map.put(11, "Pune");
        map.put(25, "Mumbai");
        map.put(null, "Jalana");
        map.put(null, "Mantha");        
        map.put(49, "Parbhani");

       
        System.out.println("\n");

        // String value= map.getOrDefault(25, null); 
        // System.out.println(value);
        // map.putIfAbsent(24, "Nanded");

        System.out.println(map);
        // Set<Integer> keys = map.keySet();
        // System.out.println(keys);           // keys

        // for (Integer k : map.keySet()) {
        //     System.out.println(" "+k+" "+map.get(k));   // values
        // }

        // for (String v : map.values()) {
        //     System.out.print(" "+v);            // values
        // }
        
        // Set<Map.Entry<Integer, String>> entries = map.entrySet();
        // System.out.println(entries);

        // for (Map.Entry<Integer,String> entry : entries) {
        //     entry.setValue(entry.getValue().toUpperCase());
        // }
        // System.out.println(map);


        // System.out.println(map.get(3));
        // System.out.println(map.containsKey(2));
        // System.out.println(map.containsValue("Mumbai"));






    }
}
