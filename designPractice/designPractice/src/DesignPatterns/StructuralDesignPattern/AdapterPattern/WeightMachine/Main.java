package DesignPatterns.StructuralDesignPattern.AdapterPattern.WeightMachine;

public class Main {
    public static void main(String[] args) {
        WeightMachine weightMachine = new WeightMachineImpl();
        weightMachine.setWeightInPounds(100);
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(weightMachine);
        System.out.println(weightMachineAdapter.getWeightInKilograms());
    }
}
