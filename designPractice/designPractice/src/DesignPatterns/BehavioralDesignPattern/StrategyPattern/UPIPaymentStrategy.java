package DesignPatterns.BehavioralDesignPattern.StrategyPattern;

public class UPIPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
