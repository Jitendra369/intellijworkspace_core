package designpattern.observer.basic;

import designpattern.observer.basic.Observable.IphoneObservable;
import designpattern.observer.basic.Observer.EmalAlterObservable;
import designpattern.observer.basic.Observer.NotificationObserver;

public class TestMain {
    public static void main(String[] args) {
        NotificationObserver notificationObserver = new EmalAlterObservable("email", new IphoneObservable());
    }
}
