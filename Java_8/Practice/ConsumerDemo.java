package Java_8.Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        
        Consumer<String> c = (name) -> System.out.println("Hi, Good Morning ! "+name);
        c.accept("Mahavir");
        c.accept("Vishwajit");


        List<Integer> list  = Arrays.asList(2,4,6,45,2,45,32,3,42);
        // list.forEach(e->System.out.print("  "+e));

        // list.stream().forEachOrdered(e->System.out.println(e));

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "a");    
        map.put(2, "b");    
        map.put(3, "c");    
        map.put(4, "d");    
        map.put(5, "e");    
        map.put(6, "f");    


        map.forEach((key, value)->System.out.println(key+"  "+value));

        map.entrySet().stream().forEach(e->System.out.println(e));

        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(e->System.out.println(e));

    }
}
