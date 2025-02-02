package Interfaces_Abstraction;

public interface MyInterface1 {

    int x = 10;     // by default static and final
    
    void disp();    // by default public and abstract


    default void disp1(){
        System.out.println("MyInterface1.disp1() | default");
    }

    static void disp2(){
        System.out.println("MyInterface1.disp2() | static");
    }

    private void disp4(){
        System.out.println("private method");
    }
}
class InnerMyInterface1_1 implements MyInterface1{

    @Override
    public void disp() {
        System.out.println("InnerMyInterface1_1.disp() | implementation method");
    }

    public void disp3(){
        System.out.println("InnerMyInterface1_1.print1() | Own method");
        System.out.println(x);  // child class can access only
    }

    
}
class InnerMyInterface1 {

    public static void main(String[] args) {
        // System.out.println(x);

        MyInterface1.disp2();

        MyInterface1 obj = new InnerMyInterface1_1();
        obj.disp();
        obj.disp1();
        

    }
    
}
