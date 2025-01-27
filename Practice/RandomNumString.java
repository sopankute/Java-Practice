package Practice;

import java.util.Random;

public class RandomNumString {
    public static void main(String[] args) {
        // 1
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.print("  "+random.nextInt(100));
            // System.out.print("  "+random.nextDouble(10));
        }

        // 2
        System.out.println(Math.random());

        // 3 apache commons-lang api

        // RandomStringUtils.randomAlphabetic();

   }
}
