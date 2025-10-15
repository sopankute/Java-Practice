package Syncronization;

public class GooglePayThread extends Thread{

    private HDFCBank hdfc;

    public GooglePayThread(HDFCBank hdfc, String name){
        System.out.println("GooglePayThread.GooglePayThread()|Thread Name : "+name);
        this.hdfc = hdfc;
    }
  
    @Override
    public void run() {
        hdfc.deposit(5000);
    }
}
