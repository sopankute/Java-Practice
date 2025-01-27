package InnerClasses;

class Outer{

    
    class Inner1{
        static int x = 10;
        static final int y = 10;
        public static void showInner(){
            System.out.println("Outer.Inner.showInner() | static member");
        }
    }

    class Inner2 {
    
        public void dispInner(){
            System.out.println("Outer.Inner2.dispInner() | Calling from Outer.callOuter() ");
        }
    }

    public void callOuter(){
        System.out.println("Outer.callOuter()");

        Inner2 in2 = new Inner2();
        in2.dispInner();
    }
}

public class InnerClasses {

    class Inner{
        public void meth1(){
            System.out.println("InnerClasses.Inner2.meth1()");
        }
    }

    public static void main(String[] args) {
        // 1
        // InnerClasses outer = new InnerClasses();
        // Inner innerObj = outer.new Inner();
        // innerObj.meth1();

        // 2
        // InnerClasses.Inner innerObj = new InnerClasses().new Inner();
        // innerObj.meth1();

        // 3
        // new InnerClasses().new Inner().meth1();


        // Outer outerObj = new Outer();
        // outerObj.callOuter();

        new Outer().new Inner2().dispInner();

    }
}
