package DesignPatterns.BehavioralDesignPattern.StatePattern;

public class IdealVendingMachineState implements VendingMachineState{
    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Coin inserted");
        vendingMachine.setVendingMachineState(new WorkingVendingMachineState());
    }

    @Override
    public void pressButton(VendingMachine vendingMachine) {
        // nothing to do
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        // nothing to do
    }
}
