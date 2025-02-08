package Java_8.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class StreamDemo12 {
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot");

        Spliterator<String> itr = list.stream().spliterator();

        itr.forEachRemaining(e->System.out.println(e));

        Object
    }
}
