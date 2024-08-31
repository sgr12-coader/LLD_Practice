package DesignPatterns.StructuralDesignPattern.BridgePattern.BreathingProcess;

public class Fish extends LivingThings{
    public Fish(BreatheProcess breatheProcess) {
        super(breatheProcess);
    }

    @Override
    public void breathe() {
        System.out.println("Fish is breathing");
        breatheProcess.breatheIn();
        breatheProcess.breatheOut();
    }
}
