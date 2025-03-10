package Wrapper;

// 3. Converting Primitive String Object to Wrapper Object{"25", "3423.646f"}

public class WrapperDemo3 {
    public static void main(String[] args) {
        
        String str1 = new String("25");
        Integer io1 = new Integer(str1);
        System.out.println(io1);

        String str2 = new String("true");
        Boolean x = new Boolean(str2);
        System.out.println(x);

        String str3 = new String("3423.646f");
        Float f = new Float(str3);
        System.out.println(f);

    }
}
