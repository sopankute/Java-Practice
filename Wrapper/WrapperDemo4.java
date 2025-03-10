package Wrapper;

// 4. Converting Primitive String Object to Primitive Type {"25", "true","3423.646f"}

public class WrapperDemo4 {
    public static void main(String[] args) {

        String str1 = new String("25");
        int i = Integer.parseInt(str1);
        System.out.println(i);

        String str2 = new String("true");
        boolean x = Boolean.parseBoolean(str2); 
        System.out.println(x);

        String str3 = new String("3423.646f");
        float f = Float.parseFloat(str3);
        System.out.println(f);
    
    }
}
