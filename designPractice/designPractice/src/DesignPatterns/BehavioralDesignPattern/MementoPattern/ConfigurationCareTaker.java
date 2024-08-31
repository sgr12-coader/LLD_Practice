package DesignPatterns.BehavioralDesignPattern.MementoPattern;

import java.util.List;

public class ConfigurationCareTaker {
    // List of mementos history
    List<ConfigurationMemento> configurationMementoList = new java.util.ArrayList<>();

    public void addMemento(ConfigurationMemento configurationMemento) {
        configurationMementoList.add(configurationMemento);
    }

    public ConfigurationMemento undo() {
        if (configurationMementoList.size() == 0) {
            return null;
        }
        ConfigurationMemento lastMemento = configurationMementoList.get(configurationMementoList.size() - 1);
        configurationMementoList.remove(configurationMementoList.size() - 1);
        return lastMemento;
    }
}
