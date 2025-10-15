package MultiThreading1.Synchronization;

public class TestSynchronization {
    public static void main(String[] args) {

        HDFCBank karthikAcount = new HDFCBank(7000);

        ATMThread atmThread = new ATMThread(karthikAcount);
        atmThread.setName("ATM-Thread");

        GPayThread gPayThread = new GPayThread(karthikAcount);
        gPayThread.setName("GPay-Thread");

        atmThread.start();
        gPayThread.start();

        karthikAcount.toString();

    }
}
