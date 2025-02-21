package Practice;

import java.util.Random;
import java.util.UUID;

public class ChallangesDemo {

    // random alphanumeric  
    char c;

    public static void generateRandomString() {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ01234abcdefghijklmnopqrstuvwxyz56789";

        Random r = new Random();

        StringBuffer sb = new StringBuffer();

        for(int i=0; i<6; i++){
            sb.append(chars.charAt(r.nextInt(chars.length())));
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        
        ChallangesDemo obj = new ChallangesDemo();
        
        System.out.println(obj.c);

       generateRandomString();


        // java.util.Random
        // Random r =new Random(); 

        // int i = r.nextInt(100,10000);
        // System.out.println(i);

        // double d = r.nextDouble(100, 500);
        // System.out.println(d);

        // float f = r.nextFloat(100);
        // System.out.println(f);

        // long l =r.nextLong(100000);
        // System.out.println(l);

        // boolean B = r.nextBoolean();
        // System.out.println(B);

        // Math.random()
        // double x = Math.random();       // 0-0.9
        // double x = Math.random()*100;      // 0-99

        // System.out.println(x);


        // String str = UUID.randomUUID().toString();
        // System.out.println(str);
    }


}
