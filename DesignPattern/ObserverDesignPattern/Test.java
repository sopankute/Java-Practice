package ObserverDesignPattern;

public class Test {

    public static void main(String[] args) {

        LCWDYouTubeChannel subject = new LCWDYouTubeChannel();

        LCWDSubscriber observer1 = new LCWDSubscriber("Aman");
        LCWDSubscriber observer2 = new LCWDSubscriber("Raman");

        // subject.subscribe(observer1);
        // subject.subscribe(observer2);
        // subject.toBeNotified("Java question uploaded.");    // 1st video upload
        // subject.toBeNotified("Spring Boot scrach video.");   // 2nd video upload
        
        // subject.unSubscribe(observer1);
        // subject.toBeNotified();             // wont be notified, Coz unsubscribed.

        

    }

}
