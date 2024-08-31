package DesignPatterns.BehavioralDesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public interface StockObservable {

    public void addObserver(NotificationObserver observer);
    public void removeObserver(NotificationObserver observer);
    public void notifyObservers();
    public int getStockCount();
    public void setStockCount(int newStockCount);
}
