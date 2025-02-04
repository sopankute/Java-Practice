package Interfaces_Abstraction;

public interface MyInterface2 {

    int x=10;

    default void disp1(){
        System.out.println("MyInterface1.disp1() | default");
    }

    void disp();
}
