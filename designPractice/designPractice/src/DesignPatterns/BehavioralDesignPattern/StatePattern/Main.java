package DesignPatterns.BehavioralDesignPattern.StatePattern;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setVendingMachineState(new IdealVendingMachineState());
        vendingMachine.insertCoin();
        vendingMachine.pressButton();
        vendingMachine.dispense();
    }
}
