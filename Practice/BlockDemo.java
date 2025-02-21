package Practice;

public class BlockDemo {

    BlockDemo(){
        System.out.println("BlockDemo.BlockDemo():Default Constructor");
    }

    {
        System.out.println("BlockDemo.enclosing_method() : Instance Block");
    }

    static{
        System.out.println("BlockDemo.enclosing_method() : Static Block");
    }


    public static void main(String[] args) {
        
        System.out.println("BlockDemo.main()");
        BlockDemo obj = new BlockDemo();            // Instance block executed before calling constructor/creating object.

    }
}
