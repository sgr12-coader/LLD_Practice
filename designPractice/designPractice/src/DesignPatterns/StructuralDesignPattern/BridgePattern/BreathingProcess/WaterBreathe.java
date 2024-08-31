package DesignPatterns.StructuralDesignPattern.BridgePattern.BreathingProcess;

public class WaterBreathe implements BreatheProcess{
    @Override
    public void breatheIn() {
        System.out.println("Water Animal is breathing in through gills");
    }

    @Override
    public void breatheOut() {
        System.out.println("Water Animal is breathing out through gills");
    }
}
