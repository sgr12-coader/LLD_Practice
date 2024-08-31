package DesignPatterns.BehavioralDesignPattern.TemplateMethodPattern;

public abstract class PaymentFlow {

    // Template Method
    public void paymentFlowTemplateExecute() {
        System.out.println("Start Payment Flow");
        authenticate();
        authorize();
        capture();
        settle();
        System.out.println("End Payment Flow");
    }

    public abstract void authenticate() ;

    public abstract void authorize() ;

    public abstract void capture();

    public abstract void settle() ;
}
