package Java_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ComparatorImplClass | Test2

public class Test2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(21);
        list.add(54);
        list.add(87);
        list.add(98);
        list.add(44);

        Collections.sort(list, new ComparatorImplClass()); // Ascending order
        System.out.println(list);
        // Collections.sort(list, (a, b)->a-b ); // Ascending order
        Collections.sort(list, (a, b) -> b - a); // Descending order
        System.out.println(list);

        // Comparator is @FunctionalInterface, here Lambda expression is an
        // implementation of |int comare(int o1, int o2);|

    }

}
