package OOPS;

public class OverloadingAmbiguityCheck {

    public void print(Object o) {
        System.out.println("Object version");
    }

    public void print(String s) {
        System.out.println("String version");
    }

    public static void main(String[] args) {
        
        OverloadingAmbiguityCheck obj = new OverloadingAmbiguityCheck();

        obj.print(null);
    }

}
