
// Life Cycle of Thread

public class MultithreadingTest3 {

    public static void main(String[] args) throws InterruptedException {

        MultithreadingDemo3 thread = new MultithreadingDemo3();
        System.out.println(thread.getState()); // NEW

        thread.start();
        System.out.println(thread.getState()); // RUNNABLE

        Thread.sleep(1000);
        System.out.println(thread.getState());  // TIMED_WAITING
        
        thread.join();  
        System.out.println(thread.getState());  // TERMINATED

    }
}
