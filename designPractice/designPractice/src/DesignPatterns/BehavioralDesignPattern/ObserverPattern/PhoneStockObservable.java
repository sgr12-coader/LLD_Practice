package DesignPatterns.BehavioralDesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class PhoneStockObservable implements StockObservable{
    int stockCount = 0;
    List<NotificationObserver> observers = new ArrayList<NotificationObserver>();
    String phone = "Phone";
    @Override
    public void addObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for(NotificationObserver observer: observers){
            observer.update("Phone");
        }

    }

    @Override
    public int getStockCount() {
        return stockCount;

    }

    @Override
    public void setStockCount(int newStockCount) {
        if(newStockCount == 0) notifyObservers();
        stockCount = stockCount + newStockCount;
    }
}
