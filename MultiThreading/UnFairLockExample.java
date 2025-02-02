import java.util.concurrent.locks.Lock;

import java.util.concurrent.locks.ReentrantLock;

class UnFairLock {

    // private Lock unfairLock = new ReentrantLock();
    private Lock unfairLock = new ReentrantLock(true);

    public void accessResource() {
        unfairLock.lock();

        System.out.println(Thread.currentThread().getName() + " Aquired the Lock!!");

        try {
            System.out.println("Doing some another work...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + " Released the aquired lock.");
            unfairLock.unlock();

        }
    }

}

public class UnFairLockExample {

    public static void main(String[] args) {

        UnFairLock obj = new UnFairLock();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                obj.accessResource();
            }
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        Thread thread3 = new Thread(task, "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();

        // Lock
        // ReentrantLock
        // ReadWriteLock
        // ReentrantReadWriteLock

    }

}
