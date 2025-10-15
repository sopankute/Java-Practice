package MultiThreading1;

public class ThreadExample extends Thread{
    
    public void run(){
        System.out.println("Hi ThreadExample1");
        salaryCalculation();
        System.out.println("Hi ThreadExample2");
    }   
    
    public void salaryCalculation(){
        System.out.println("Salary Calculations ongoing...");
    }

    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.hashCode());
        System.out.println(t.isAlive());
        System.out.println(t.isDaemon());
        System.out.println(t.getClass().toString());
        System.out.println(t.getPriority());

        ThreadExample t1 = new ThreadExample();
        ThreadExample t2 = new ThreadExample();

        t1.start();
        t2.start();

    }
}
