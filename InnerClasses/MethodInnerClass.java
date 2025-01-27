package InnerClasses;

import InnerClasses.AccessOutermember.InnerClass;

public class MethodInnerClass {

    public void method1(){

        class InnerClass{
            public void sum(){
                int x=23, y=54;
                System.out.println("MethodInnerClass.method1().InnerClass.sum() | x+y = "+(x+y));
            }
        }

        InnerClass innerObj = new InnerClass();
        innerObj.sum();
    }

    public static void main(String[] args) {
        // InnerClass obj = new InnerClass();      // can't Access 

        new MethodInnerClass().method1();
    }
}
