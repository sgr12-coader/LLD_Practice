package DesignPatterns.BehavioralDesignPattern.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        ShopingCart cart = new ShopingCart(new CardPaymentStrategy());
        cart.pay(100);
        cart = new ShopingCart(new CashPaymentStrategy());
        cart.pay(200);
        cart = new ShopingCart(new UPIPaymentStrategy());
        cart.pay(300);
    }
}
