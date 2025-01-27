package Java_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamObjects {
    public static void main(String[] args) {
        
        // Blank Stream
        Stream<Object> stream = Stream.empty();
        
        // Convert Array, List, Collection
        String names[] ={"Sunil","Vishwajit", "Namdev", "Mahavir", "Sopan"};
        Stream<String> stream2 = Stream.of(names);
        stream2.forEach(e->System.out.println(e));

        // Stream.of(new ArrayList<>());
    }
}
