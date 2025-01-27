package Java_8;


// CounterClass | Test1

public class Test1 {
    public static void main(String[] args) {
        // Regular Implements
        // CounterClass obj = new CounterClass();
        // Thread thread = new Thread(obj);
        // thread.start();

        // Lambda Expression
        Runnable runnable = ()->{
            // implementation of run()
            for(int i=0; i<100; i++){
                System.out.println("Runnble.run() "+i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        // thread.run();


        for(int i=0; i<=100; i++){
            System.out.println("Test1.main() "+i);
        }
    }
}
