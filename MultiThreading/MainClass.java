
public class MainClass {
    public static void main(String[] args) {
        

        // BankAcount account = new BankAcount();
        BankAccount1 account = new BankAccount1();

        Runnable task = new Runnable() {
            @Override
            public void run(){
                account.withdraw(300.0);
            }
        };

        Thread t1 = new Thread(task,"Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        t1.start();
        t2.start();
    }
}
