package Wrapper;

// 5. Converting Wrapper Object to Primitive String Object

public class WrapperDemo5 {
    public static void main(String[] args) {

        Integer io = new Integer(2345);
        String str1 = io.toString(io);
        System.out.println(str1);

        
        float f = Float.parseFloat("234.34f");

    }
}
