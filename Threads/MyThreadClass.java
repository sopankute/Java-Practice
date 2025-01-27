package Threads;

class MyThread extends Thread{}
class MyThread1 extends Thread{
    public void run(){
        System.out.println("myThread1");
    }
    public void run(int i){
        System.out.println("myThread1 | i : "+i);
    }
}

class MyThread2 extends Thread{

    public void run(){
        System.out.println("MyThread2.run()");
    }

    public void start(){
        super.start();
        System.out.println("MyThread2.start()");
    }
}

public class MyThreadClass {
    public static void main(String[] args) {
/*    
        MyThread t = new MyThread();
        t.start();      // No output

        MyThread1 t1 = new MyThread1();
        t1.start();     // myThread1
        // t1.run();       // myThread1 - Normal method call
        // t1.run(4);
 */
        MyThread2 t2 = new MyThread2();
        t2.start();     
        // MyThread2.start()
        // MyThreadClass.main() - vary o/p
        // MyThread2.run()

       


        
        System.out.println("MyThreadClass.main()");
    }
}
