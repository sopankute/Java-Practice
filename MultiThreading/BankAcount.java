public class BankAcount {

    private double balance = 1000;
    
    public synchronized void winthdraw(double amount){

        System.out.println(Thread.currentThread().getName()+" | Starting to Withdraw : "+amount);

        if(balance >= amount){
            System.out.println(Thread.currentThread().getName()+" | Proceed to withdraw.");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;

            System.out.println(Thread.currentThread().getName()+" | Completed withdrawal. Remaining balance is :"
                                                                    +balance);
        }else{
            System.out.println(Thread.currentThread().getName()+" | Insufficient Balance");
        }

    }
}
