package Java_8;

import java.util.Comparator;

public class ComparatorImplClass implements Comparator<Integer> {




    @Override
    public int compare(Integer o1, Integer o2) {
        
        return o1 - o2;
    }

}
