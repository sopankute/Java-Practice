package Interfaces_Abstraction;

public class MyInterfaceTest1 implements MyInterface2, MyInterface3 {

    @Override
    public void disp1(){
        MyInterface2.super.disp1();
        // System.out.println("MyInterfaceTest1.disp1()");
    }

    @Override
    public void disp() {
       
    }

    public static void main(String[] args) {
        
        System.out.println(x);
    }
}
