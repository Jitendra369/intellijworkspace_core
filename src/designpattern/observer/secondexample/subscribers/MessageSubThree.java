package designpattern.observer.secondexample.subscribers;

import designpattern.observer.secondexample.Message;
import designpattern.observer.secondexample.Observer;

public class MessageSubThree implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("third messageSubscriber "+ message.getMessageContent());
    }
}
