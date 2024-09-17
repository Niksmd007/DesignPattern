package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStocksCount(int newStockAdded) {
        if (stockCount == 0) {
            notifySubscriber();
        }
        stockCount = newStockAdded;
    }

    @Override
    public void getStocksCount() {
        System.out.println("stockCount : "+stockCount );
    }
}
