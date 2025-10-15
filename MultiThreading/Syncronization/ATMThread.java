package Syncronization;

public class ATMThread extends Thread {

    private HDFCBank hdfc;

    public ATMThread(HDFCBank hdfc, String name){
        System.out.println("ATMThread.ATMThread()|Thread Name : "+name);
        this.hdfc = hdfc;
    }

    @Override
    public void run() {
        hdfc.withdraw(3000);
    }

}
