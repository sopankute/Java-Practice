

public class MultithreadingTest6 {

    public static void main(String[] args) {
        
        Counter6 counter = new Counter6();

        MultithreadingDemo6 thread1 = new MultithreadingDemo6(counter);
        MultithreadingDemo6 thread2 = new MultithreadingDemo6(counter);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            
        System.out.println(counter.getCount());

    }
}


