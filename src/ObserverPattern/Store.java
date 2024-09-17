package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable observable = new IphoneObservableImpl();
//        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("niks123@gmail.com", observable);
//        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("nikhil123@gmail.com", observable);
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("niks123@gmail.com");
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("nikhil123@gmail.com");
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("niks");

        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);
        observable.setStocksCount(10);
        observable.getStocksCount();
        observable.setStocksCount(0);
        observable.getStocksCount();
        observable.setStocksCount(100);
        observable.getStocksCount();
    }
}

