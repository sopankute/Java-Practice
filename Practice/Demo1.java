package Practice;


import java.util.HashMap;

import java.util.Map;


public class Demo1 {
    public static void main(String[] args) {
        
        String[] names = {"Suyash", "Vishya", "Sunil", "Suyash", "Vishya", "Suyash", "mahavir", "Vishya", "Sopan", "Suyash", "Sopan"};
        
        // HashMap = Unique key and value
        Map<String, Integer> map = new HashMap<>();
        for (String e : names) {
            
            if(!map.containsKey(e)){
                map.put(e, 1);
            }else{  // if map having already then put and increament by 1
                map.put(e, map.get(e)+1);
            }
        }
        System.out.println(map);
        int max=0;
        for (Integer count : map.values()) {    // get All Values
            if(count>max){
                max=count;
            }
        }
        System.out.println(max);
    }
}
