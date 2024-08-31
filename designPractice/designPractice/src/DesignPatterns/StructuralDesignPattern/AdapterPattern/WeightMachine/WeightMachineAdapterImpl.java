package DesignPatterns.StructuralDesignPattern.AdapterPattern.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    private WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public int getWeightInKilograms() {
        return (int) (weightMachine.getWeightInPounds() * 0.453592);
    }
}
