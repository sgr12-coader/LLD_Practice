package DesignPatterns.BehavioralDesignPattern.TemplateMethodPattern;

public class CardPayment extends PaymentFlow{
    @Override
    public void authenticate() {
        System.out.println("Card Payment: Authenticate");
    }

    @Override
    public void authorize() {
        System.out.println("Card Payment: Authorize");
    }

    @Override
    public void capture() {
        System.out.println("Card Payment: Capture");
    }

    @Override
    public void settle() {
        System.out.println("Card Payment: Settle");
    }
}
