package Threads;

public class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("Test.main()");
    }
}
