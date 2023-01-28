package designpattern.observer.secondexample.subscribers;

import designpattern.observer.secondexample.Message;
import designpattern.observer.secondexample.Observer;

public class MessageSubscriberTwo implements Observer {
    @Override
    public void update(Message message) {
        System.out.println(" message subscriber two "+message.getMessageContent());
    }
}
