package Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IndentityHashMapClass {
    public static void main(String[] args) {
        String key1 = new String("key");    // hashcode based on "key" so key1.equals(key2) are equals
        String key2 = new String("key");
        System.out.println("key1 "+key1.hashCode()+"   key2 "+key2.hashCode());
        System.out.println("key1 "+System.identityHashCode(key1)+"   key2 "+System.identityHashCode(key2));

        System.out.println(key1==key2); // false

        Map<String, Integer> hashMap = new HashMap<>(); // insertion based on hashcode() and equals()
        hashMap.put(key1, 11);  // key1=key, 11
        hashMap.put(key2, 22);  // key2=key, 22

        System.out.println(hashMap);    // {key=22}
        // hashMap.putIfAbsent(key2, 22)  // like this
       
        Map<String, Integer> identitymap = new IdentityHashMap<>(); // insertion based on hashcode() and ==
        identitymap.put(key1, 11);  // key1=key, 11
        identitymap.put(key2, 22);  // key2=key, 22

        System.out.println(identitymap);    // {key=11, key=22}



    }
}
