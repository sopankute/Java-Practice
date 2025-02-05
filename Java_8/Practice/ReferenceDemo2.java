package Java_8.Practice;

import java.util.Arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ReferenceDemo2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,6,8,3,4,9,1,6,3);

        list.forEach(e->System.out.print("  "+e));
        System.out.println();
        
        // Sorting
        Collections.sort(list);     // Ascending
        
        Collections.sort(list, (i,j)-> j.compareTo(i));     // Ascending
        
        Collections.sort(list, (i,j)-> (i>j) ? -1 : 1);     // Descending

        list.forEach(e->System.out.print("  "+e));      
    

    }
}
