package com.string;

public class Immutability {

    public static void main(String[] args) {

        String str = "Hello";   // SCP

        String s1 =  str.concat(" World");      // Heap (Hello World)

        String s2 = str.concat(" World").intern();  // SCP (Hello World)

        String s3 = "Hello World";  // SCP (Hello World)

        String s4 = new String("Hello World");      // Heap (Hello World)

        System.out.println(s4.equals(s3));
        System.out.println(s4 == s2);

    }
}
