
public class MultithreadingDemo5 extends Thread{
    @Override
    public void run() {
        
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }

    public static void main(String[] args) {

        MultithreadingDemo5 thread1 = new MultithreadingDemo5();
        MultithreadingDemo5 thread2 = new MultithreadingDemo5();

        thread1.start();
        thread2.start();


    }

}
