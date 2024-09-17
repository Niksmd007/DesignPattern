package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
String userName;
StockObservable observable;

    public MobileAlertObserverImpl(String userName, StockObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
     sendMessageOnMobile(userName,"product is available in stocks hurry up !!");
    }
    private  void sendMessageOnMobile(String userName,String msg){
        System.out.println("msg sent to : "+userName);
    }
}
