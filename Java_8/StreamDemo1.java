package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {

    public static void main(String[] args) {
        // 1
        Stream<Integer> st = Stream.of(5,2,7,9,2,7,4,1);

        List<String> list = Arrays.asList("Suyash", "Vishya", "Sunil", "Suyash", "Vishya", "Suyash", "mahavir");
        
        // 2
        Stream<String> st1 = list.stream();

    }
}
