package MultiThreading1.Synchronization;

public class GPayThread extends Thread {
    
    private HDFCBank hdfcBank;

    public GPayThread(HDFCBank hdfcBank){
        this.hdfcBank = hdfcBank;
    }

    @Override
    public void run(){
        hdfcBank.diposit(5000);
    }

}
