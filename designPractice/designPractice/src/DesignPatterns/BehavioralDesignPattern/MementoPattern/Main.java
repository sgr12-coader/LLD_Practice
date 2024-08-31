package DesignPatterns.BehavioralDesignPattern.MementoPattern;

public class Main {
    public static void main(String[] args) {
        ConfigurationCareTaker configurationCareTaker = new ConfigurationCareTaker();
        ConfigurationOriginator configurationOriginator = new ConfigurationOriginator();

        ConfigurationMemento snapshot1 = configurationOriginator.createMemento();
        configurationCareTaker.addMemento(snapshot1);
        System.out.println("Current Configuration: " + configurationOriginator.getConfiguration());

        configurationOriginator.setConfiguration("Configuration 1");
        ConfigurationMemento snapshot2 = configurationOriginator.createMemento();
        configurationCareTaker.addMemento(snapshot2);
        System.out.println("Current Configuration: " + configurationOriginator.getConfiguration());

        configurationOriginator.setConfiguration("Configuration 2");
        ConfigurationMemento snapshot3 = configurationOriginator.createMemento();
        configurationCareTaker.addMemento(snapshot3);
        System.out.println("Current Configuration: " + configurationOriginator.getConfiguration());

        configurationOriginator.restoreMemento(configurationCareTaker.undo());
        System.out.println("Configuration after undo: " + configurationOriginator.getConfiguration());

        configurationOriginator.restoreMemento(configurationCareTaker.undo());
        System.out.println("Configuration after undo: " + configurationOriginator.getConfiguration());

        configurationOriginator.restoreMemento(configurationCareTaker.undo());
        System.out.println("Configuration after undo: " + configurationOriginator.getConfiguration());

    }
}
