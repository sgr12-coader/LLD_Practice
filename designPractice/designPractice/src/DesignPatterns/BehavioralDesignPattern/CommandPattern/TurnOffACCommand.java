package DesignPatterns.BehavioralDesignPattern.CommandPattern;

public class TurnOffACCommand implements Command{
    private AirConditioner airConditioner;

    TurnOffACCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOff();
    }

    @Override
    public void undo() {
        airConditioner.turnOn();
    }
}
