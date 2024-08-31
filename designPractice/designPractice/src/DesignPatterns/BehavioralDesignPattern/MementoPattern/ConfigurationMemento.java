package DesignPatterns.BehavioralDesignPattern.MementoPattern;

public class ConfigurationMemento {
    private String configuration; // state

    // set the state
    public ConfigurationMemento(String configuration) {
        this.configuration = configuration;
    }

    // get the state
    public String getConfiguration() {
        return configuration;
    }
}
