package Java_8.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPIPractice2 {
    public static void main(String[] args) {
    
    /*
        List<Integer> list = List.of(6,8,4,3,9,2,3,8);

        int sumOfSquaresStream = list.stream().filter(number-> number % 2 == 0)
                        .mapToInt(number -> number * number)
                        .sum();
        System.out.println(sumOfSquaresStream);     // 184

    */

        List<String> words = Arrays.asList("Hellow", "World", "how", "are", "you");

        List<String> uppeStringsList = words.stream().map(word -> word.toUpperCase()).collect(Collectors.toList());

        System.out.println(uppeStringsList);

        List<List<Integer>> nestedList = Arrays.asList(
            Arrays.asList(9,5,2),
            Arrays.asList(8,4,1),
            Arrays.asList(3,7,0)
        );

        List<Integer> list = nestedList.stream().flatMap(List::stream).filter(e->e%2==0).map(e-> e*e).collect(Collectors.toList());
        System.out.println(list);   // [4, 64, 16, 0]

        int sumOfSquare = nestedList.stream().flatMap(List::stream).filter(e->e%2==0).mapToInt(e-> e*e).sum();
        System.out.println(sumOfSquare);    // 84
    }   
}
