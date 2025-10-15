package Syncronization;

public class HDFCBankTest {

    public static void main(String[] args) {
        
        HDFCBank hdfc1 = new HDFCBank(7000);        // create HDFCBank instance

        ATMThread atmThread = new ATMThread(hdfc1, "ATMThread");     // provide thread name and passing HDFCBank instance

        GooglePayThread gpayThread = new GooglePayThread(hdfc1, "GooglePayThread");

        atmThread.start();

        gpayThread.start();

        System.out.println("HDFCBankTest.main() | HDFC Balance : "+hdfc1.getBalance());

    }
}
