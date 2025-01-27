package Syncronization;

public class MyThread extends Thread {
    
    // Syncronization, Critical section, Race condition, Mutual Exclusion (mutex)
    Counter counter;

    public MyThread(Counter counter) {
       this.counter = counter;
    }

    public void run(){

        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
    
}
