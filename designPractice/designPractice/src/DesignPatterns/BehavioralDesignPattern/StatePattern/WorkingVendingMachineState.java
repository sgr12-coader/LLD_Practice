package DesignPatterns.BehavioralDesignPattern.StatePattern;

public class WorkingVendingMachineState implements VendingMachineState{
    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Coin inserted");
    }

    @Override
    public void pressButton(VendingMachine vendingMachine) {
        // can create a different state for this as well
        System.out.println("Dispensing product");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        // can create a different state for this as well
        System.out.println("Collect the product");
    }
}
