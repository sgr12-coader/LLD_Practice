package DesignPatterns.StructuralDesignPattern.BridgePattern.BreathingProcess;

public class LandBreathe implements BreatheProcess{
    @Override
    public void breatheIn() {
        System.out.println("Land Animal is breathing in through lungs");
    }

    @Override
    public void breatheOut() {
        System.out.println("Land Animal is breathing out through lungs");
    }
}
