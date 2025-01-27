package InnerClasses;

public class AnonymousThreadClass {

    public static void main(String[] args) {
        System.out.println("AnonymousClass2.main()");

        Thread t = new Thread(){
            public void run(){
                System.out.println("new Thread() {...}.run()");
            }
        };
        t.start();


        new Thread(){
            @Override
            public void run() {
                System.out.println("AnonymousClass | .new Thread() {...}.run()");
            }
        }.start();
    }
}
