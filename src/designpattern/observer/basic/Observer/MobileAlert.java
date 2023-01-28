package designpattern.observer.basic.Observer;

import designpattern.observer.basic.Observable.StockObservable;

public class MobileAlert implements NotificationObserver {

    String message;
    StockObservable stockObservable;

    public MobileAlert(String message, StockObservable stockObservable) {
        this.message = message;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMessageToMobile(this,message,"product is in stock, HUrry...");
        
    }

    private void sendMessageToMobile(MobileAlert mobileAlert, String message, String s) {
        System.out.println(" message send to ,,,,,,");
    }
}
