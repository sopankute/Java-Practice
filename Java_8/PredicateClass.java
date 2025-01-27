package Java_8;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateClass {

    public static void main(String[] args) {

        // Predicate<Integer> predicate = x -> x<=10;
        // if (predicate.test(11)) { // 2<=10 true | 11<=10 false | test(T) - replace x
        // with T then see result
        // System.out.println("Predicate..");
        // }
        // System.out.println("Not Predicate");

        // Predicate<Integer> predicate = x -> x % 2 == 0;

        // int[] arr = { 22, 65, 88, 5, 10, 43 };
        // for (int i : arr) { // replace i with x see result
        //     if (predicate.test(i)) {
        //         System.out.println("Even : " + i);
        //         continue;
        //     }
        //     System.out.println("odd : " + i);
        // }


        Function<String, Integer> function = str -> str.length();
        int R = function.apply("Pune");
        System.out.println(R);              // 4

    }

    // // return true/false
    // public boolean fun(int x) { // same as predicate
    // return x <= 10; // can use this condition anywhere
    // }
}
