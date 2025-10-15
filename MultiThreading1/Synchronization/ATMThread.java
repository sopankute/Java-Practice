package MultiThreading1.Synchronization;

public class ATMThread extends Thread {
    
    private HDFCBank hdfcBank;

    public ATMThread(HDFCBank hdfcBank){
        this.hdfcBank = hdfcBank;
    }

    @Override
    public void run(){
        hdfcBank.withdraw(4000);
    }
}
