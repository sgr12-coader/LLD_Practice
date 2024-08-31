package DesignPatterns.BehavioralDesignPattern.TemplateMethodPattern;

public class UPIPaymentFlow extends PaymentFlow{
    @Override
    public void authenticate() {
        System.out.println("UPI Payment: Authenticate");
    }

    @Override
    public void authorize() {
        System.out.println("UPI Payment: Authorize");
    }

    @Override
    public void capture() {
        System.out.println("UPI Payment: Capture");
    }

    @Override
    public void settle() {
        System.out.println("UPI Payment: Settle");
    }
}
