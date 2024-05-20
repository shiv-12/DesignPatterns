package ObserverPattern.subscribers;

import ObserverPattern.publishers.Publisher;

public interface Subscriber {

    public void update(Publisher publisher);

}
