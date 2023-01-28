package designpattern.observer.secondexample.subscribers;

import designpattern.observer.secondexample.Message;
import designpattern.observer.secondexample.MessagePublisher;

public class TestMain {
    public static void main(String[] args) {
        MessageSubscriber messageSubscriber = new MessageSubscriber();
        MessageSubscriberTwo messageSubscriberTwo = new MessageSubscriberTwo();
        MessageSubThree messageSubThree = new MessageSubThree();

        MessagePublisher messagePublisher = new MessagePublisher();

        messagePublisher.attatch(messageSubscriber);
        messagePublisher.attatch(messageSubscriberTwo);
        messagePublisher.attatch(messageSubThree);

        messagePublisher.notifyUpdate(new Message("first packet"));
        messagePublisher.notifyUpdate(new Message("second packet"));

        messagePublisher.detach(messageSubscriber);
        messagePublisher.detach(messageSubscriberTwo);

        messagePublisher.notifyUpdate(new Message("third packet"));


    }
}
