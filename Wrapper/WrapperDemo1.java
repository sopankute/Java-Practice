
package Wrapper;

// 1. Converting Primitive Type to Wrapper Object   // Boxing

public class WrapperDemo1 {
    public static void main(String[] args) {
        
        Integer io = new Integer(25);

        // Double do = new Double(23.54);
        
        // Character co = new Character('c');

        Boolean xo = new Boolean(true);

        System.out.println(io);

        Float fo1 = new Float(3542.54);
        Float fo2 = new Float(42.4f);
        

        int x = 12;
        Integer y = new Integer(x);
        System.out.println(y);

        float f = 678.987f;
        Float fo = new Float(f);
        System.out.println(fo);

        char c = 'G';
        Character co = new Character(c);
        System.out.println(co);

        
        Integer z = 45;
        System.out.println(z);
    }
}
