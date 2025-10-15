
public class MultithreadingDemo3 extends Thread {

    @Override
    public void run() {
        System.out.println("RUNNING");  // RUNNING
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}
