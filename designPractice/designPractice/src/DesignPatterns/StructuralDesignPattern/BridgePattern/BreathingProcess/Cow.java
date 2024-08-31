package DesignPatterns.StructuralDesignPattern.BridgePattern.BreathingProcess;

public class Cow extends LivingThings {
    public Cow(BreatheProcess breatheProcess) {
        super(breatheProcess);
    }

    @Override
    public void breathe() {
        System.out.println("Cow is breathing");
        breatheProcess.breatheIn();
        breatheProcess.breatheOut();
    }
}
