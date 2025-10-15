package Set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetClass {

    public static void main(String[] args) {
        
        Set<Integer> set = new TreeSet<>();         // 
        // Set<Integer> set = new HashSet<>();         // Unorder
        // Set<Integer> set = new LinkedHashSet<>();   // order maintain

        set.add(45);
        set.add(76);
        set.add(68);
        // set.add(null);
        set.add(63);
        // set.add(null);
        set.add(87);
        set.add(23);

        // System.out.println(set);

        Iterator itr = set.iterator();

       while(itr.hasNext()){
        System.out.print(itr.next()+"  ");
       }
        
    }    
}
