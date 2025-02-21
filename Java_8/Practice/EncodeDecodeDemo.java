package Java_8.Practice;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodeDecodeDemo {
    public static void main(String[] args) {
        
        String pwd = "ashokit@123";

        Encoder encoder =  Base64.getEncoder();

        byte[] encodedPwd = encoder.encode(pwd.getBytes());

        System.out.println(encodedPwd);         // [B@28a418fc


        Decoder decoder = Base64.getDecoder();
        byte[] decodedPwd = decoder.decode(encodedPwd);

        String originalPwd = new String(decodedPwd);
        System.out.println(originalPwd);        // ashokit@123

    }
}
