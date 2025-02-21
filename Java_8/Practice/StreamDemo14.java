package Java_8.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo14 {

    public static void main(String[] args) {
        
        int[] numbers = {23, 87, 45, 87, 23, 9, 65, 45, 87, 23, 97, 43, 23 ,27, 73};
        
        int reduce = Arrays.stream(numbers).reduce(0, (a,b)->a+b);
        System.out.println(reduce);     // sum of all numbers

    }
}
