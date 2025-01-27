package Java_8;

import java.sql.Date;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIClass {

    public void add() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            if (arr[i] % 2 == 0)
                sum += arr[i];
        }

        int sum1 = Arrays.stream(arr).filter(x->x%2==0).sum();
        
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("sunil", "Vishwajit", "mahavir");
        
        Stream<String> listStream = list.stream();

        String[] str = {"sunil", "Vishwajit", "mahavir"};

        Stream<String> stringStream = Arrays.stream(str);

        Stream<Integer> intStream = Stream.iterate(0, n->n+1).limit(10);
        Set<Integer> setStream = intStream.collect(Collectors.toSet());
        System.out.println(setStream);

        int[] arr = { 1, 2, 3, 4, 5 };

       

    }
}
