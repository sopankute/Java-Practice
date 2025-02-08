package Java_8.Practice;

import java.util.Arrays;
import java.util.List;

public class StreamDemo11 {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // list.forEach(e->System.out.println(e+" : "+Thread.currentThread().getName()));

        // System.out.println();

        list.stream().parallel().forEach(e->System.out.println(e+" : "+Thread.currentThread().getName()));
    }
}
