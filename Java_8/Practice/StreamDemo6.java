package Java_8.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo6 {
    public static void main(String[] args) {

        // Nested Collection

        List<String> western = Arrays.asList("France", "USA", "England","Itely");
        List<String> eastern = Arrays.asList("India",  "Austrailia", "Japan", "China" );

        List<List<String>> list = Arrays.asList(western, eastern);

        list.stream().forEach(e->System.out.println(e));    // print both collection separeatly

        // [France, USA, England, Itely]
        // [India, Austrailia, Japan, China]

        // to print in sequential manner 
        Stream<String> stream1 = list.stream().flatMap(e-> e.stream());
        stream1.forEach(e-> System.out.print("  "+e));
        
        // France  USA  England  Itely  India  Austrailia  Japan  China
    }
}
