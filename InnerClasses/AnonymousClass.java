package InnerClasses;

class Test {

    public void taste(){
        System.out.println("Test.taste() | Spicy Taste");
    }
}


public class AnonymousClass {
    public static void main(String[] args) {

        Test obj1 = new Test();
        obj1.taste();               // ATest.taste() | Spicy Taste 
        
        // 1
        Test obj2 = new Test(){
            public void taste(){
                System.out.println("Salty Taste");
            }
            public void meth(){
                System.out.println("Drinking");
            }
        };
        obj2.taste();       // Salty Taste
        // obj2.meth();     // can't Access

        // // 2
        // new Test(){
        //     public void taste(){
        //         System.out.println("Sweet Taste");
        //     }
        // }.taste();
    }
}
