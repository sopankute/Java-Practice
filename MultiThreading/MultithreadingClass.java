
public class MultithreadingClass{
	
	// Program = MS Word is a program 
	// Process = open MS Word is Process which can have multiple theads. Typing, Auto-Spelling
	// Thread = Smallest unit of execution within a process. can share same resouces but run Independently. 
	// Multitasking = Allows OS to Run multiple Process simultaneously.
	// Multithreading = Ability to execute multiple threads within single process consurrently.

	// Multitasking - Processes (MS Word) - Multithreading - Threads (Typing and Auto-Spelling)
	// Multithreading enhances the efficiency of multitasking by breaking down individual task into smaller threads

	// java.lang - java.lang.Thread(C) & java.lang.Runnable(I)
	// JVM can distribute threads across multiple cores, allowing to parallel execution of threads.

	// Life cycle of Thread
	// New - Runnable - Running - Bolcked/Waiting - Terminated

	//   Runnable
	//  	| 
	//   Thread

	// run(), start(), sleep(), join(), setPriority(), interrupt(), yeild() - allow another thread to execute, 
	// setDeaman()-run thread on background main thread wont wait till termination of deamon thread.


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