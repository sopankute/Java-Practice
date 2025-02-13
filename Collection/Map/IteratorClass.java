package Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

           list.add(70);
           list.add(10);
           list.add(40);
           list.add(80);
           list.add(50);
           list.add(10);
           list.add(20);

        for(Integer i : list){
            System.out.print("  "+i);
        }

        System.out.println();
        
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            if(itr.next()%4==0){
                itr.remove();
            }
        }
        System.out.println(list);

    }
}
