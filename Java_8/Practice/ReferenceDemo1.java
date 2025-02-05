package Java_8.Practice;

class PrintNumber{

    public static void print(){
        for (int i = 0; i < 6; i++) {
            System.out.println("  "+i);
        }
    }
}

public class ReferenceDemo1 {
    public static void main(String[] args) {
        // 1
        Runnable r = PrintNumber::print;
        Thread t = new Thread(r);
        t.start();

        new Thread(PrintNumber::print).start();

        // 2
        Runnable r1 = new Runnable() {
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                }
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        // 3
        Runnable r3 = ()->{
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
        };
        new Thread(r3).start();

        // 4
        new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
        }).start();
    }
}
