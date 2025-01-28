public class ThreadGroupClass1 {

    public static void main(String[] args) {
        
        ThreadGroup group1 = new ThreadGroup("g1");

        Thread t1 = new Thread(group1,"Thread 1");
        Thread t2 = new Thread(group1, "Thread 2");

        group1.setMaxPriority(3);

        Thread t3 = new Thread(group1, "Thread 3");

        System.out.println(t1.getPriority());   // 5
        System.out.println(t2.getPriority());   // 5
        System.out.println(t3.getPriority());   // 3
        

    }
}
