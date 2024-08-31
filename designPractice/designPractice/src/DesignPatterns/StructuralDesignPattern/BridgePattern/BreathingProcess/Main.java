package DesignPatterns.StructuralDesignPattern.BridgePattern.BreathingProcess;

public class Main {
    public static void main(String[] args) {
        LivingThings cow = new Cow(new LandBreathe());
        cow.breathe();
        System.out.println("=====================================");
        LivingThings fish = new Fish(new WaterBreathe());
        fish.breathe();
        System.out.println("=====================================");
        LivingThings tree = new Tree(new TreeBreathe());
        tree.breathe();
    }
}
