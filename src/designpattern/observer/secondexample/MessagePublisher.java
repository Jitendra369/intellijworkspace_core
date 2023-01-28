package designpattern.observer.secondexample;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject{

    private List<Observer> observersList = new ArrayList<>();

    @Override
    public void attatch(Observer observer) {
        observersList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observersList.remove(observer);

    }

    @Override
    public void notifyUpdate(Message message) {
        for (Observer observer : observersList){
            observer.update(message);
        }
    }
}
