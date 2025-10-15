
public class MultithreadingTest {
    public static void main(String[] args) {
        
        // MultithreadingDemo1 thread = new MultithreadingDemo1();
        // thread.start();
        // thread.run();       // overidden run method will executed

        MultithreadingDemo2 runnable = new MultithreadingDemo2();

        Thread thread = new Thread(runnable);

        thread.start();
        // thread.run();        // overidden run method will executed

        System.out.println("MultithreadingTest.main()");
    }
}
