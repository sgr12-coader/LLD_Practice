package DesignPatterns.BehavioralDesignPattern.StrategyPattern;

public class CashPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Cash");
    }
}
