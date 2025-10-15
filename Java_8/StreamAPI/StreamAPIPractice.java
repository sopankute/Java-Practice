package Java_8.StreamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPIPractice {
    public static void main(String[] args) {


        
// 6 find words with specified number of vowels. No of Vowels = 2;
    // String str = "I am Learning am Stream API in Java";

    // Arrays.stream(str.split(" ")).filter(e->e.replaceAll("[^aeiouAEIOU]", ""))




//  5 Find occurance of each word in string 

    // String str = "I am Learning am Stream API in Java Java";

    // Map<Object, Long> map = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(e->e, Collectors.counting()));
    
    // System.out.println(map);



//  4 Find length of 2nd highest word
    // String str = "I am Learning Stream API in Java";

    // Integer length = Arrays.stream(str.split(" "))
    //                             .map(e->e.length())
    //                             .sorted(Comparator.reverseOrder())
    //                             .skip(1).findFirst().get();
    //                             // .collect(Collectors.toList());   // [8, 6, 4, 3, 2, 2, 1]

    // System.out.println(length);     // 6



//  3 Find second highest length word 
    // String str = "I am Learning Stream API in Java";

    // String secHighWord = Arrays.stream(str.split(" "))
    //                             .sorted(Comparator.comparing(String::length).reversed())
    //                             .skip(1)
    //                             .findFirst()
    //                             .get();
    //                             // .collect(Collectors.toList());   // [Learning, Stream, Java, API, am, in, I]
    
    // System.out.println(secHighWord);     // Stream



//  2 Remove duplicates from the string and return in same order

    //     String str = "dabcadefg";   // o/p: dabcefg 
    
    // //  1
    //     str.chars()                                 // converted into char
    //         .distinct()                             // retrived unique chars
    //         .mapToObj(e-> (char)e)                  // typecasted asscii to char
    //         .forEach(e-> System.out.print(" "+e));  // printed each char

    //         System.out.println("  ");
    // //  2
    //     Arrays.stream(str.split("")).distinct().forEach(System.out::print);


        // String str = "I am Learning Stream API in Java";

        // String[] arr = str.split(" ");

        // // 1 Print length of each word within string
        // List<Integer> list = Arrays.stream(arr).map(e-> e.length()).collect(Collectors.toList());
        // System.out.println(list);

        // // 1 
        // String str1 = Arrays.stream(arr).max(Comparator.comparing(String::length)).get();

        // // 2 
        // String str2 = Arrays.stream(arr).max((w1, w2)-> Integer.compare(w1.length(), w2.length())).get();

        // System.out.println(str1+"\n"+str2);

        // // 3 
        // String word = Arrays.stream(str.split(" "))
        //                     .max(Comparator.comparing(String::length))
        //                     .get();

        // System.out.println(word);

    }


}
