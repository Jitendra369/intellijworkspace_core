package designpattern.observer.basic.Observer;

import designpattern.observer.basic.Observable.StockObservable;

public class EmalAlterObservable implements  NotificationObserver{

    String email;
    StockObservable stockObservable;

    public EmalAlterObservable(String email, StockObservable stockObservable){
        this.email = email;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        sendEmail(email, "product stock main hai");
    }

    private void sendEmail(String email, String mail_body) {
        System.out.println("email id "+ email);
    }
}
