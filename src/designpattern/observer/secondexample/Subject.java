package designpattern.observer.secondexample;

public interface Subject {
    void attatch(Observer observer);
    void detach(Observer observer);
    void notifyUpdate(Message message);
}
