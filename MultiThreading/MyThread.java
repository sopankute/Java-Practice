
public class MyThread extends Thread {

    public void run(){      // can't throws InterruptedException here, overridden run() not handling exception.
        System.out.println("RUNNING");  // RUNNING

        try {
            Thread.sleep(2000);      // TIMED_WAITING
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        
        MyThread t1=new MyThread();
        System.out.println(t1.getState());  // NEW
        t1.start();
        System.out.println(t1.getState());  // RUNNABLE

        Thread.sleep(1000);
        System.out.println(t1.getState());  // TIMED_WAITING

        t1.join();                          // main thread wait for completion of t1 (MyThread)
        System.out.println(t1.getState());  // TERMINATED

    }

}
