package ObserverPattern.publishers;

import ObserverPattern.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannelPublisher implements Publisher {

    private final List<Subscriber> subscribers;
    private final String chanelName;
    private String latestVideoContent;

    public YouTubeChannelPublisher(String chanelName) {
        this.chanelName = chanelName;
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyAllSubscribers(String latestVideoContent) {
        this.latestVideoContent = latestVideoContent;
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this);
        }
    }

    @Override
    public String getLatestVideoContent() {
        return this.latestVideoContent;
    }

    @Override
    public String getChanelName() {
        return this.chanelName;
    }
}
