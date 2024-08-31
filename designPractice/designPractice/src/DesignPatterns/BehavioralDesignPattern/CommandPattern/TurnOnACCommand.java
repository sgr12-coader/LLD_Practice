package DesignPatterns.BehavioralDesignPattern.CommandPattern;

public class TurnOnACCommand implements Command{
    private AirConditioner airConditioner;

    TurnOnACCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }

    @Override
    public void undo() {
        airConditioner.turnOff();
    }
}
