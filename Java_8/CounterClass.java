package Java_8;

public class CounterClass implements Runnable {

    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("CounterClass " + i);
        }

    }
}
