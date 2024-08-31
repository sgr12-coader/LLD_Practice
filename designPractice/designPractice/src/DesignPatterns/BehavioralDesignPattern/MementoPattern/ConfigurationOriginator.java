package DesignPatterns.BehavioralDesignPattern.MementoPattern;

public class ConfigurationOriginator {
    private String configuration;

    public void setConfiguration(String configuration) {
        this.configuration = configuration;

    }

    public ConfigurationMemento createMemento() {
        return new ConfigurationMemento(configuration);
    }

    public void restoreMemento(ConfigurationMemento configurationMemento) {
        configuration = configurationMemento.getConfiguration();

    }

    public String getConfiguration() {
        return configuration;
    }
}
