package InnerClasses;

public class AnonymousRunnableClass {

    public static void main(String[] args) {
        System.out.println("AnonymousRunnableClass.main()");

        // 1
        // Runnable obj = new Runnable() {
        //     @Override
        //     public void run() {
        //         System.out.println("AnonymousRunnable | new Runnable() {...}.run()");
        //     }
        // };
        // new Thread(obj).start();

        new Thread(new Runnable(){
            public void run(){
                System.out.println("new Thread().new Runnable().run()");
            }
        }).start();


    }
}
