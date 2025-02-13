package Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapClass {
    public static void main(String[] args) {
        
        // SortedMap<Integer, String> sortedMap = new TreeMap<>();
        SortedMap<Integer, String> sortedMap = new TreeMap<>((a,b)->b-a);

        sortedMap.put(77, "Sunil");
        sortedMap.put(34, "Namdev");
        sortedMap.put(89, "Vishwajit");
        sortedMap.put(45, "Mahavir");
        sortedMap.put(65, "Shirish");

        System.out.println(sortedMap);
        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap(65));
        System.out.println(sortedMap.tailMap(77));
        // System.out.println(sortedMap.subMap(65, 77));
        System.out.println(sortedMap.subMap(77, 34));

    }
}
