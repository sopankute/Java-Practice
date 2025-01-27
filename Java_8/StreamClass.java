package Java_8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamClass {

    public static void main(String[] args) {
    // Create list and filter all even numbers form list

        List<Integer> list = List.of(7,2,8,3,5,3,8);
        List<Integer> evenList = new ArrayList<>();

        for (Integer e : list) {
            if(e%2 == 0){
                evenList.add(e);
            }
        }
        System.out.println(evenList);

        List<Integer> newList = list.stream().filter(e->e%2==0).toList();
        System.out.println(newList);


        List<Integer> newList2 = list.stream().filter(e-> e>3).toList();
        System.out.println(newList2);
    }   
}
