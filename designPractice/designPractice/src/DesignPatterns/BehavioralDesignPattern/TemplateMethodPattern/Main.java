package DesignPatterns.BehavioralDesignPattern.TemplateMethodPattern;

public class Main {
    public static void main(String[] args) {
        PaymentFlow cardPayment = new CardPayment();
        cardPayment.paymentFlowTemplateExecute();
        System.out.println();
        PaymentFlow upiPayment = new UPIPaymentFlow();
        upiPayment.paymentFlowTemplateExecute();
    }
}
