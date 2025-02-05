package Java_8.Practice;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        // 1. Generate OTP
        Supplier<String> s = ()->{
            String otp = "";
            for (int i=0; i<4; i++) {
                otp += (int) (Math.random()*10);
            }
            return otp;
        };

        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());

    }
}
