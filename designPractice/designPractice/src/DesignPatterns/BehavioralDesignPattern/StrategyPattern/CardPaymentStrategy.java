package DesignPatterns.BehavioralDesignPattern.StrategyPattern;

public class CardPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}
