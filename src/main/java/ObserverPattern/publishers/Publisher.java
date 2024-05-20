package ObserverPattern.publishers;

import ObserverPattern.subscribers.Subscriber;

public interface Publisher {

    public void addSubscriber(Subscriber subscriber);

    public void removeSubscriber(Subscriber subscriber);

    public void notifyAllSubscribers(String latestVideoContent);

    public String getLatestVideoContent();

    public String getChanelName();
}
