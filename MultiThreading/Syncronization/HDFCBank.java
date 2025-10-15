package Syncronization;

public class HDFCBank {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public HDFCBank(double balance){
        this.balance = balance;
    }

    public synchronized void withdraw(double withdrawAmount){
        balance = this.balance - withdrawAmount;
    }

    public synchronized void deposit(double depositedAmount){
        balance = this.balance + depositedAmount;
    }


    
}
