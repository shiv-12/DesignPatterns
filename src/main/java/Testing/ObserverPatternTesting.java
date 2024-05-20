package Testing;

import ObserverPattern.publishers.Publisher;
import ObserverPattern.publishers.YouTubeChannelPublisher;
import ObserverPattern.subscribers.Subscriber;
import ObserverPattern.subscribers.YouTubeChannelSubscriber;
import Testing.Test.Test;

public class ObserverPatternTesting implements Test {
    @Override
    public void test() {

        System.out.println("\nObserver Pattern Calling : ");

        Subscriber Shivam = new YouTubeChannelSubscriber("Shivam");
        Subscriber Raghav = new YouTubeChannelSubscriber("Raghav");

        Publisher CodeWithHarryPublisher = new YouTubeChannelPublisher("CodeWithHarry");
        CodeWithHarryPublisher.addSubscriber(Shivam);
        CodeWithHarryPublisher.addSubscriber(Raghav);
        CodeWithHarryPublisher.notifyAllSubscribers("Java Tutorials Part 1 Uploaded!");

        CodeWithHarryPublisher.removeSubscriber(Raghav);
        CodeWithHarryPublisher.notifyAllSubscribers("Java Tutorials Part 2 Uploaded!");
    }
}

/*

Publisher with methods : addSubscriber removeSubscriber notifyAll(updatedContent), getters
Subscriber with method : update(Publisher)

Note : latest Content Will always transfer using NotifyAll method


*/