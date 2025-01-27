package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class LCWDYouTubeChannel implements Subject {
    // Will have list of Observer(subcriber). 

    List<Observer> list = new ArrayList<>();

    @Override
    public void subscribe(Observer obs) {
       // Once Subscribed, will be added to LCWD(Subject) familly.
        list.add(obs);
    }

    @Override
    public void toBeNotified(String msg) {
     // Whenever LCWD will add Videos, Subscriber(Observer) gets Notified. 
        for (Observer observer : this.list) {
            observer.hasBeenNotified(msg);
        }
    }

    @Override
    public void unSubscribe(Observer obs) {
      // Once unSubscribed, will not be member of LCWD familly and not get Notified.
        list.remove(obs);
    }

}
