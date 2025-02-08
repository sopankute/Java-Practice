package Java_8.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {

    public static void main(String[] args) {

        // String Array
        String[] str = { "Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliett",
            "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango" };

        for(String e:str){System.out.print(e+"  ");}
        System.out.println();

        // Integer Array
        Integer[] arr = { 10, 12, 53, 74, 55, 46, 77, 18, 39, 10, 16, 57, 38, 92, 80, 13, 23, 87, 10, 55 };
        for(int e : arr){System.out.print(e+"  ");}
        System.out.println();

        // 1. find element more than 20
        for(int e : arr){
            if(e>50){System.out.print(e+"  ");}
        }
        System.out.println();

        // or Using Stream
        List<Integer> list = Arrays.asList(arr);

        Stream<Integer> stream = list.stream();
        Stream<Integer> filterStream = stream.filter(e-> e>50);
        filterStream.forEach(e->System.out.print(e+"  "));
        System.out.println();

        // list.stream().filter(e->e>50).forEach(e->System.out.print(e+"  "));


        // 2. Print names whose name starting with 'A'

        List<String> list2 = Arrays.asList(str);

        list2.stream().filter(e->e.startsWith("A")).forEach(e->System.out.println(e));
    }   
}
