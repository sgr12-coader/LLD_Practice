package DesignPatterns.BehavioralDesignPattern.CommandPattern;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        TurnOnACCommand turnOnACCommand = new TurnOnACCommand(airConditioner);
        TurnOffACCommand turnOffACCommand = new TurnOffACCommand(airConditioner);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnACCommand);
        remoteControl.pressButton();
        remoteControl.pressUndo();
        System.out.println();
        remoteControl.setCommand(turnOffACCommand);
        remoteControl.pressButton();
        remoteControl.pressUndo();
        System.out.println();


    }
}
