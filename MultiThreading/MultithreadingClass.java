
public class MultithreadingClass{
	
	public static void main(String[] args) {
		
		WorldThreadClass obj1=new WorldThreadClass();	// New
		obj1.start();									// Runnable

		HelloRunnableClass obj2=new HelloRunnableClass();
		Thread t = new Thread(obj2);
		t.start(); 

		for (int i=0;i<100000 ;i++ ) {
			System.out.println("World "+ Thread.currentThread().getName());
		}
	}
}