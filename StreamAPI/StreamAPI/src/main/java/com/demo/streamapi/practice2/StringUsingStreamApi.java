package com.demo.streamapi.practice2;

import javax.swing.text.html.Option;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class StringUsingStreamApi {

    public static void main(String[] args) {

        List<String> fruits1 = Arrays.asList("Apple", "Orange", "Pineapple", "Strawberry", "Mango", "Banana", "Grapes", "Papaya", "Watermelon", "Kiwi", "Guava", "Peach", "Cherry", "Lychee", "Pomegranate");

        List<String> fruits2 = Arrays.asList("Apple", "Orange", "Pineapple", "Strawberry", "Mango", "Banana", "Apple", "Grapes", "Papaya", "Mango", "Watermelon", "Kiwi", "Guava", "Apple", "Banana");

        // convert String to Uppercase and sort it
//        fruits1.stream().map(String::toUpperCase).sorted().forEach(System.out::println);

        // words having length more than 6 and their count
        long countElements = fruits1.stream().filter(e -> e.length() > 6).count();
//        System.out.println(countElements);

        // Unique list of String
//        Set<String> uniqueFruites = fruits2.stream().collect(Collectors.toSet());     // 1
//        uniqueFruites.forEach(System.out::println);
//        fruits2.stream().distinct().forEach(System.out::println);       // 2

        // find particular word from list and find first element
        String firstElement = fruits1.stream()
//                    .filter(e-> e.contains("Strawberry"))
                        .filter(e -> e.contains("r"))
                        .findFirst().orElseThrow(() -> new IllegalArgumentException("No Element found"));
//        System.out.println(firstElement);

        // remove specific word
//        fruits2.stream().filter(e->!e.startsWith("M")).forEach(System.out::println);


        // sorting length of each word in Ascending
//        fruits1.stream().map(e-> e.length()).sorted().forEach(e-> System.out.print(e+"  "));

        // sort words based on length in Ascending
//        fruits1.stream().sorted((s1, s2) -> s1.length() - s2.length()).forEach(System.out::println);

        // sorting length of each word in Descending
//        fruits1.stream().map(e -> e.length()).sorted((s1, s2)-> s2-s1).forEach(e-> System.out.print(e+"  "));

        // sort words based on length in Descending (Comparator)
//        fruits1.stream().sorted((s1, s2)-> s2.length() - s1.length()).forEach(System.out::println);

        // sort words based on length in Descending - (Comparable)
//        fruits1.stream().sorted((s1, s2) -> ((Integer)s2.length()).compareTo(s1.length())).forEach(System.out::println);

        // sort words based on length in Descending - (in-built methods)
//        fruits1.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

        // find longest word
        String  longestWord = fruits1.stream()
                    .sorted(Comparator.comparing(String::length).reversed())
                    .findFirst()
                     .orElseThrow(()-> new IllegalArgumentException("Element Not found"));

//        System.out.println(longestWord);


        String str = "This is a very long string created for testing purpose, it contains many words and continues.";

        List<String> words = Arrays.asList("Apple", "Sky", "pInEapple", "cry", "myth", "try", "kiwi");

        List<String> vowelsList = words.stream().filter(e->!e.matches(".*[aeiou].*")).collect(Collectors.toList());
//        vowelsList.forEach(System.out::println);

        String listToCombinedString = fruits1.stream().collect(Collectors.joining("| "));
//        System.out.println(listToCombinedString);

        // Reverse Each of String element from list of String

        List<StringBuilder> elementReversedList = fruits1.stream().map(e-> new StringBuilder(e).reverse()).collect(Collectors.toList());
//        elementReversedList.forEach(System.out::println);
//        System.out.println(elementReversedList);


        List<String> wordsList = Arrays.asList("Apple", null, "Sky", "pInEapple", "", "cry", "myth", null, "try", "kiwi");
        List<String> nonEmptyList = wordsList.stream().filter(e-> (e != null && !e.isEmpty())).collect(Collectors.toList());
//        System.out.println(nonEmptyList);

        // group element by their first char
        Map<Character, List<String>> elementByFirstChar = fruits2.stream().collect(Collectors.groupingBy(e->e.charAt(0)));
//        elementByFirstChar.entrySet().forEach(e-> System.out.println(e.getKey()+" : "+e.getValue()));
        elementByFirstChar.forEach((key, value)->{
            System.out.println(key+" : "+value);
        });

        System.out.println();

        // group list of string by length
        fruits1.stream().collect(Collectors.groupingBy(String::length))
                .forEach((key, value)->{
                    System.out.println(key+" : "+value);
                });

        System.out.println();

        Map<Boolean, List<String>> listOfStringByVowels = words.stream().collect(Collectors.partitioningBy(e-> e.matches(".*[aeiou].*")));
        listOfStringByVowels.forEach((k, v)->{
            System.out.println(k+" : "+v);
        });

    }
}
