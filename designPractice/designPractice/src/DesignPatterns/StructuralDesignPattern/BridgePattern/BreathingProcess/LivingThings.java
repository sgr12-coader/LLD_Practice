package DesignPatterns.StructuralDesignPattern.BridgePattern.BreathingProcess;

public abstract class LivingThings {
    protected BreatheProcess breatheProcess;

    public LivingThings(BreatheProcess breatheProcess) {
        this.breatheProcess = breatheProcess;
    }

    public abstract void breathe();
}
