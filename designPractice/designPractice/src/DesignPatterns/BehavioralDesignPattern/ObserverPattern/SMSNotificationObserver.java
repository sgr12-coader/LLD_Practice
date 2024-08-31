package DesignPatterns.BehavioralDesignPattern.ObserverPattern;

public class SMSNotificationObserver implements NotificationObserver{
    @Override
    public void update(String item) {
        System.out.println("SMS Notification:"+item+" Stock is updated");
    }
}
