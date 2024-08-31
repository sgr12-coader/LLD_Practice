package DesignPatterns.StructuralDesignPattern.AdapterPattern.WeightMachine;

public class WeightMachineImpl implements WeightMachine {
    int weightInPounds;

    @Override
    public int getWeightInPounds() {
        return weightInPounds;
    }

    @Override
    public void setWeightInPounds(int weightInPounds) {
        this.weightInPounds = weightInPounds;
    }
}
