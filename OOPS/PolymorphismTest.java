package OOPS;

class Parent{
    // public void add(int x, int y){
    //     System.out.println("Parent.add() | "+(x+y));
    // }

    // public void add(int x, double y){
    //     System.out.println("Parent.add() | "+(x+y));
    // }

    // public void add(int x, int y, double z){
    //     System.out.println("Parent.add() | "+(x+y+z));
    // }

    static int x = 22;
    public void property(){
        System.out.println("Parent.property()");
    }
    void happy(){
        System.out.println("Parent.happy()");
    }

}
class Child extends Parent{

    int x = 33;

    @Override
    void happy() throws ArithmeticException{    // Unchecked Exception
        System.out.println("Child.happy()");
    }
}
public class PolymorphismTest {
    public static void main(String[] args) {  
        Parent p = new Parent();
        System.out.println("Parent Obj");
        // p.add(3,5);
        // p.add(6, 45.2);
        // p.add(3, 8, 9.2);
        // p.property();               // Parent.property()
        // p.happy();                  // Parent.happy()

        Child c = new Child();
        System.out.println("Child Obj");
        // c.property();               // Parent.property()
        // c.happy();                  // Child.happy()
        
        
        Parent p1 = new Child();
        System.out.println("Dynamic method dispatch parent reference child obj");
        // p1.property();              // Parent.property()
        // p1.happy();                 // Child.happy()


        System.out.println(p.x);    // 22
        System.out.println(c.x);    // 33
        System.out.println(p1.x);   // 22


        

    }
}
