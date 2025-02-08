package Java_8.Practice;

import java.util.Arrays;
import java.util.List;

public class StreamDemo4 {

    public static void main(String[] args) {
        
        List<String> countries = Arrays.asList("India", "France", "USA", "England","Itely", "Austrailia", "Japan");

        //1. Convert to Uppercase
        for (String c : countries) {System.out.print(" "+c.toUpperCase());}
        System.out.println();

        // 2.
        countries.stream().map(e->e.toLowerCase()).forEach(e->System.out.print(e+" "));

        // Find length of each string element.
        countries.stream().mapToInt(e-> e.length()).forEach(e->System.out.print("  "+e));
        // System.out.println();

        // Find length of Country name which starting with "I"
        countries.stream().filter(e-> e.startsWith("I")).map(e->e+"-"+e.length()).forEach(e->System.out.println(e));



    }   
}
