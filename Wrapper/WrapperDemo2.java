package Wrapper;

// 2. Converting Wrapper Object to Primitive    // Un-Boxing

public class WrapperDemo2 {
    public static void main(String[] args) {
        
        Float f = new Float(435.4353f);     // Wrapper
        float f1 = f;       // Wrapper to Primitive
        System.out.println(f1);

        Character co = new Character('J');
        char c = co;
        System.out.println(c);

    }
}
