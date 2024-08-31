package DesignPatterns.StructuralDesignPattern.BridgePattern.BreathingProcess;

public class TreeBreathe implements BreatheProcess{
    @Override
    public void breatheIn() {
        System.out.println("Tree is breathing in through leaves");
    }

    @Override
    public void breatheOut() {
        System.out.println("Tree is breathing out through leaves");
    }
}
