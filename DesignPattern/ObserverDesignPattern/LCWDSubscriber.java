package ObserverDesignPattern;

public class LCWDSubscriber implements Observer {

    private String name;

    public LCWDSubscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void hasBeenNotified(String msg) {
        // System.out.println("LCWDSubscriber.hasBeenNotified() | " + name + " Got the Notification of New video Upoaded.");
        System.out.println("LCWDSubscriber.hasBeenNotified() | " + name + ", "+msg);
    }

}
