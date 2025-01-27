package Collection;

import java.util.HashSet;

import java.util.Set;


public class SetClass {

    public static void main(String[] args) {
        
        // Set<Integer> set = new TreeSet<>();         // 
        Set<Integer> set = new HashSet<>();         // Unorder
        // Set<Integer> set = new LinkedHashSet<>();   // Unorder

        set.add(45);
        set.add(76);
        set.add(68);
        set.add(63);
        set.add(87);
        set.add(23);

        System.out.println(set);

       
        
    }    
}
