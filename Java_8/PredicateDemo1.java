package Java_8;

import java.util.function.Predicate;

// Extract name which are starting with 'A'
public class PredicateDemo1 {
    public static void main(String[] args) {
        
        String[] names = {"Anushka", "Dipika", "Anupama", "Kajol", "Sunny"};
        

        Predicate<String> p = name -> name.charAt(0) == 'A';
        Predicate<String> p1 = e-> e.startsWith("A");         
        System.out.println(p1);
        
        for (String name : names) {
            if(p.test(name)){
                System.out.println(name);
            }
        }
    }
}
