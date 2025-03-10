
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadExample extends Thread{


    public static void main(String[] args) {
        
        ThreadPoolExecutor tp = new ThreadPoolExecutor(NORM_PRIORITY, MIN_PRIORITY, MAX_PRIORITY, null, null)


        ExecutorService executorService1 =  Executors.newSingleThreadExecutor();
        
        ExecutorService executorService2 = Executors.newFixedThreadPool(4); 
        
        ExecutorService executorService3 = Executors.newCachedThreadPool();
        
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);


    }

}
