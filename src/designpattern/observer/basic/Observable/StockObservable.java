package designpattern.observer.basic.Observable;


import designpattern.observer.basic.Observer.NotificationObserver;

public interface StockObservable {
    public void add (NotificationObserver observer);
    public void remove(NotificationObserver observer);
    public void notifySubscriber();
    public void setStockCount(int newStockCount);
    public int getStockCount();
}
