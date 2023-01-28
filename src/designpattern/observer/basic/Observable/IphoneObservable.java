package designpattern.observer.basic.Observable;

import designpattern.observer.basic.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable {

    public List<NotificationObserver> notificationObserverList = new ArrayList<>();
    public int stockCount =0;


    @Override
    public void add(NotificationObserver observer) {
        notificationObserverList.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        this.notificationObserverList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for (NotificationObserver notificationObserver : this.notificationObserverList){
            notificationObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if (stockCount==0){
            notifySubscriber();
        }
        stockCount = stockCount + newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
