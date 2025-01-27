public class TryCatch {

    public void show1()  {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("TryCatch.show1()");
    }
    public void show2() {
        show1();
        System.out.println("TryCatch.show2()");
    }
    public void show3() {
        show2();
        System.out.println("TryCatch.show3()");
    }

    public static void main(String[] args)  {
        // System.out.println("TryCatch.main()");

        // try {                    // recommanded
        //     Thread.sleep(3000);
        // } catch (InterruptedException e) {
        //    e.printStackTrace();
        // }
        
        // Thread.sleep(3000);
        // System.out.println("TryCatch.main() | After 1000 ms");

        TryCatch obj = new TryCatch();
        obj.show3();

    }
}
