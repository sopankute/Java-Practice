package com.string.streamapi;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIonString {

    // Count occurrence of each element in an String array
    public static void countOccurrence(String [] arr){
        Map<String, Long> occurrences = Arrays.stream(arr).collect(Collectors.groupingBy(e-> e, Collectors.counting()));
        occurrences.forEach((k, v)-> {
            System.out.print(k+" : "+v+", ");
        });
    }

    // Collect Unique element from a list of string
    public static void uniqueFromStringList(List<String> list){
        List<String> list1 = list.stream()
                                .distinct()
                                .toList();
        System.out.println("\n"+list1);
    }

    public static void countDuplicateString(List<String> list){

    }

    public static void main(String[] args) {

        String[] arr = {"apple", "banana", "apple", "orange", "banana", "apple", "Pineapple", "Guava" };

        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "Pineapple", "Guava");

        countOccurrence(arr);

        uniqueFromStringList(list);

        // TODO: Count duplicate String from a list of string
        countDuplicateString(list);

//        Count duplicate characters from a string
        String str = "JavaJprogramming";

        Map<Character, Long> freq = str.chars()
                .mapToObj(iToC -> (char) iToC)   // int to char to Character
                .collect(Collectors.groupingBy(c-> c, Collectors.counting()));

//        freq.forEach((k,v)->{ System.out.println(k+" : "+v); });    // occurrences

        freq.entrySet().stream().filter(e-> e.getValue()>1);     // duplicate chars
//                .forEach(System.out::println);

//        System.out.println(reverseString(str));

        String string = "I love java program";

//        repeatedChar(string);
        otherStream(string);

    }

    public static String reverseString(String str){
        if (str.isEmpty()){
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void repeatedChar(String str){
        System.out.println("String : "+str);
        Map<Character, Long > freq = str.chars().mapToObj(e-> (char)e)
                    .collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()));

        Optional<Character> character = freq.entrySet().stream().filter(c-> c.getValue()==1)
                .map(Map.Entry::getKey).findFirst();
        System.out.println(character.get());
    }

    public static void otherStream(String str){
        System.out.println("String : "+str);
        String word = Arrays.stream(str.split(" "))
                             .max(Comparator.comparing(String::length))
                             .get();
        System.out.println(word);
    }
}
