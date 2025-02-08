package Java_8.Practice;

import java.util.Arrays;
import java.util.List;

public class StreamDemo7 {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("India", "France", "Russia", "USA", "England","China","Itely", "Austrailia", "Japan");

        // Print 1st 3 countires
        countries.stream().limit(3).forEach(e->System.out.print("  "+e));
        System.out.println();

        // Skip 1st 3 countires
        countries.stream().skip(3).forEach(e->System.out.print("  "+e));
        System.out.println();

        // Print Uniques elements
        List<Integer> list = Arrays.asList(10, 53, 55, 46, 77, 18, 39, 10, 16, 57, 55, 46, 77, 87, 10, 55 );
        list.stream().distinct().forEach(e->System.out.print("  "+e));

        
    }
}
