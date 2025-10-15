
public class MultithreadingDemo6 extends Thread {

    private Counter6 counter;

    public MultithreadingDemo6(Counter6 counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            counter.increament();
        }
        
    }




}
