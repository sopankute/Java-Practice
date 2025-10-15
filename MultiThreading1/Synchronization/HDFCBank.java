package MultiThreading1.Synchronization;

public class HDFCBank {
    
    int accountBalance;

    public HDFCBank(int balance){
        this.accountBalance = balance;
    }

    synchronized void withdraw(int withdrawalAmount){
        accountBalance = this.accountBalance - withdrawalAmount;
        System.out.println("Withdrawal from ATM | Account Balance : "+accountBalance);
    }
    
    synchronized void diposit(int amountToBeDeposite){
        accountBalance = this.accountBalance + amountToBeDeposite;
        System.out.println("Deposited by GPay | Account Balance : "+accountBalance);
    }
}
