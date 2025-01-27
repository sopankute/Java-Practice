package Java_8;

public class LambdaFunctionClass implements MyInterface {

    @Override
    public void sayHello() {
        System.out.println("I'm Overidden method of Functional Interface");
    }

    public static void main(String[] args) {

        LambdaFunctionClass obj = new LambdaFunctionClass();
        obj.sayHello();
        obj.sayHi();

        MyInterface ref = new LambdaFunctionClass();
        ref.sayHello();
        ref.sayHi();
        MyInterface.sayBye();
    }
}
