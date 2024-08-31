package DesignPatterns.BehavioralDesignPattern.StrategyPattern;

public class ShopingCart {
    private PaymentStrategy paymentStrategy;

    public ShopingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount) {
        paymentStrategy.pay(amount);
    }
}
