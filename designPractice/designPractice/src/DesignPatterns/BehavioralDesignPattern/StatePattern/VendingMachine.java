package DesignPatterns.BehavioralDesignPattern.StatePattern;

public class VendingMachine {
    private VendingMachineState vendingMachineState;


    public void insertCoin() {
        vendingMachineState.insertCoin(this);
    }

    public void pressButton() {
        vendingMachineState.pressButton(this);
    }

    public void dispense() {
        vendingMachineState.dispense(this);
    }

    public VendingMachineState getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(VendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }
}
