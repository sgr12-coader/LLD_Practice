package DesignPatterns.BehavioralDesignPattern.ObserverPattern;

public class Main {
    public static void main(String[] args) {
        StockObservable stock = new MACStockObservable();
        NotificationObserver smsObserver = new SMSNotificationObserver();
        NotificationObserver emailObserver = new EmailNotificationObserver();
        stock.addObserver(smsObserver);
        stock.addObserver(emailObserver);
        stock.setStockCount(10);
        stock.notifyObservers();
        System.out.println("*****************************");
        StockObservable phoneStock = new PhoneStockObservable();
        phoneStock.addObserver(smsObserver);
        phoneStock.addObserver(emailObserver);
        phoneStock.setStockCount(20);
        phoneStock.notifyObservers();


    }
}
