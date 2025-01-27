import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class Parent{
    int x;
    public Parent(){
        System.out.println("Parent.Parent() Constructor...");
    }
    
    public Parent(int x){
        System.out.println("Parent.Parent() Constructor..."+x);
    }

    protected void methodOne() throws Exception{ }

    public void methodTwo() throws IOException{ }
}

class Child extends Parent{
    int x, y;
    public Child(){
        System.out.println("Child.Child() Constructor... ");
    }
    
    public Child(int x, int y){
        // super(10);
        System.out.println("Child.Child() Constructor... "+x+" | "+y);
    }

    protected void methodOne() throws IOException{ }
    public void methodTwo() throws FileNotFoundException { }
}
class GrandChild extends Child {
    int x, y, z;
    public GrandChild(){
       
        System.out.println("GrandChild.GrandChild() Constructor...");
    }
    
    public GrandChild(int x, int y, int z){

        System.out.println("GrandChild.GrandChild() Constructor..."+x+" | "+y+" | "+z);
    }
    
}
public class TestConstructor {
    
    public static void main(String[] args) {
        
        // GrandChild objGrandChild = new GrandChild();
        // GrandChild objGrandChild = new GrandChild(5, 10, 15);


        // Child objChild = new Child();


        // Parent objParent = new Parent();
        // Parent objParent = new Parent();

        


    }
}
