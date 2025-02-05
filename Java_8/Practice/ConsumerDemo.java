package Java_8.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        
        Consumer<String> c = (name) -> System.out.println("Hi, Good Morning ! "+name);
        c.accept("Mahavir");
        c.accept("Vishwajit");


        List<Integer> list  = Arrays.asList(2,4,6,45,2,45,32,3,42);
        list.forEach(e->System.out.print("  "+e));

       

    }
}
