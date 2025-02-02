import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class ReadWriteLockClass {

    private int count = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    private final Lock readLock = lock.readLock();

    private final Lock writeLock = lock.writeLock();

    // Writing mechanism
    public void increament() {
        writeLock.lock();
        try {
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }  finally {
            writeLock.unlock();
        }
    }

    // Reading mechanism
    public int getCount() {
        readLock.lock();
        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }
}

public class ReadWriteLockExample {
    public static void main(String[] args) throws InterruptedException {

        ReadWriteLockClass obj = new ReadWriteLockClass();

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println(Thread.currentThread().getName()+" Read : "+obj.getCount());
                }
            }
        };

        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    obj.increament();
                    System.out.println(Thread.currentThread().getName()+" Incremented :");
                }
            }
        };

        Thread writeThread = new Thread(writeTask);
        Thread readThread1 = new Thread(readTask);
        Thread readThread2 = new Thread(readTask);

        writeThread.start();
        readThread1.start();
        readThread2.start();

        writeThread.join();
        readThread1.join();
        readThread2.join();

    }
}
