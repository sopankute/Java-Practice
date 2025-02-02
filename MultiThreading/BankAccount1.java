import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount1 {

    private double balance = 500;
    private final Lock lock = new ReentrantLock();

    public void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + " Attempting to withdraw");

        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {

                System.out.println(Thread.currentThread().getName() + " I got the Lock !!");
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " Processing to withdraw...");
                        Thread.sleep(3000);
                        balance -= amount;
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }

                    System.out.println(Thread.currentThread().getName() + " Amount withdrwal successfully..."+balance);

                } else {
                    System.out.println(Thread.currentThread().getName() + " Not sufficient balance.");
                }

            } else {
                System.out.println(
                        Thread.currentThread().getName() + " Couldn't able to acquired a lock. will try later.");
            }

        } catch (InterruptedException e) {
           Thread.currentThread().interrupt();
        }

        if (Thread.currentThread().isInterrupted()) {
            System.out.println("BankAccount1.withdraw() | Current thread is interrupted.");
        }

    }   
}
