package DesignPatterns.BehavioralDesignPattern.CommandPattern;

public class AirConditioner {
    boolean isOn = false;
    public void turnOn() {
        isOn = true;
        System.out.println("Air Conditioner is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Air Conditioner is off");
    }

}
