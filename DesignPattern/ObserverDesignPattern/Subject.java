package ObserverDesignPattern;

public interface Subject {  // like youtube channel - LCWD will upload video for its Subscriber

    void subscribe(Observer obs);

    void unSubscribe(Observer obs);

    void toBeNotified(String msg);        // will notify to observer

}
