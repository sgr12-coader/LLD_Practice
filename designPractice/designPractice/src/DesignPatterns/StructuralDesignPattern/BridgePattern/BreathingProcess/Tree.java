package DesignPatterns.StructuralDesignPattern.BridgePattern.BreathingProcess;

public class Tree extends LivingThings{
    public Tree(BreatheProcess breatheProcess) {
        super(breatheProcess);
    }

    @Override
    public void breathe() {
        System.out.println("Tree is breathing");
        breatheProcess.breatheIn();
        breatheProcess.breatheOut();
    }
}
