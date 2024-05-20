package ObserverPattern.subscribers;

import ObserverPattern.publishers.Publisher;

public class YouTubeChannelSubscriber implements Subscriber {

    private final String subscriberName;

    public YouTubeChannelSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(Publisher publisher) {
        System.out.println("Notification Sent To " + this.subscriberName + "! " +
                " With Content - " + publisher.getLatestVideoContent() +
                " (By - " + publisher.getChanelName() + ")");
    }
}
