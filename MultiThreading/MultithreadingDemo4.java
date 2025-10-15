
public class MultithreadingDemo4 extends Thread{

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                System.out.println(Thread.currentThread().getName()+" is Running...");
                Thread.sleep(4000);
                // System.out.println("............");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+" interrupted "+e);
            }
        }
    }   
    
    public static void main(String[] args) throws InterruptedException {
        
        MultithreadingDemo4 thread1 = new MultithreadingDemo4();
    
        thread1.start();     
        Thread.sleep(6000);
        thread1.interrupt();


        
        // for(int i=0; i<5; i++){
        //     thread1.join(2000);     
        //     System.out.println("\nMain Thread "+i);
        //     // thread1.sleep(1000);
        // }

    }

}
