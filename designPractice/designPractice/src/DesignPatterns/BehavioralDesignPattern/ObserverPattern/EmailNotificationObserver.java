package DesignPatterns.BehavioralDesignPattern.ObserverPattern;

public class EmailNotificationObserver implements NotificationObserver{
    @Override
    public void update(String item) {
        System.out.println("Email Notification:"+ item +" Stock is updated");
    }
}
