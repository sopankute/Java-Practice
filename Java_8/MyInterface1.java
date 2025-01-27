
package Java_8;

public interface MyInterface1 {
    void sayHello();

    public static void main(String[] args) {
        System.out.println("MyInterface1.main()");
    }
}

// class Child1 implements MyInterface1 {
// @Override
// public void sayHello() {
// System.out.println("Child.sayHello() | Implementation of MyInterface");
// }
// }
class TestClass {
    public static void main(String[] args) {
        // 1st approach
        // MyInterface1 emp1 = new Child1();
        // emp1.sayHello();

        // 2nd approach
        MyInterface1 emp2 = () -> System.out.println("TestClass.main() |  | Implementation of MyInterface");
        emp2.sayHello();

        // 3rd approach
        MyInterface1 emp3 = new MyInterface1() {
            @Override
            public void sayHello() {
                System.out.println("TestClass.main() |  | Implementation of MyInterface");
            }
        };

        emp3.sayHello();

        
        MyInterface1.main(args);
    }
}
