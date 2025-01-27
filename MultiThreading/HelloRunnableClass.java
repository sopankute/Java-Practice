

public class HelloRunnableClass implements Runnable{
	
	public void run(){
		for (int i=0; i<=1000000 ;i++ ) {
			System.out.println("Hello "+Thread.currentThread().getName());
		}
	}
}
