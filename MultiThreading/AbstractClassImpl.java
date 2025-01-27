
abstract class AbstractClass {

    abstract public void processStatus();
    

    public void display() {
        System.out.println("AbstractClass.display() | Hi Good Moring...");
    }
}

public class AbstractClassImpl extends AbstractClass {

    @Override
    public void processStatus() {
        System.out.println("AbstractClassImpl.processStatus() | Implemented abstract method");
    }

    public void show(){
        System.out.println("AbstractClassImpl.show() | Good Evening...");
    }

    public static void main(String[] args) {

        AbstractClassImpl obj1 = new AbstractClassImpl();
        obj1.processStatus();
        obj1.display();
        obj1.show();

        AbstractClass obj2 = new AbstractClassImpl();
        obj2.processStatus();
        obj2.display();
        // obj2.show();

    }

}
