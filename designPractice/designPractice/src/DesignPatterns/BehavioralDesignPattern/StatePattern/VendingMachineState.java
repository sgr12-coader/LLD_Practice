package DesignPatterns.BehavioralDesignPattern.StatePattern;

public interface VendingMachineState {
    void insertCoin(VendingMachine vendingMachine);
    void pressButton(VendingMachine vendingMachine);
    void dispense(VendingMachine vendingMachine);
}
