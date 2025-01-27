package Java_8;

@FunctionalInterface
public interface MyInterface {
    void sayHello(); // by default all undefined methods are Abstract.

    public default void sayHi() {
        System.out.println("I'm Default method | sayHi()");
    }

    static void sayBye() {
        System.out.println("I'm Static method | sayBye()");
    }
}
