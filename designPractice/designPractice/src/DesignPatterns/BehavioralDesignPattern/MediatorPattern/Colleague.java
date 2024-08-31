package DesignPatterns.BehavioralDesignPattern.MediatorPattern;

public interface Colleague {
    void receiveMessage(String message);
    void bid(int amount);
    String getName();
}
