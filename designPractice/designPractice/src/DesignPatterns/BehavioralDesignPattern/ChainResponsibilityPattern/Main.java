package DesignPatterns.BehavioralDesignPattern.ChainResponsibilityPattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor errorLogProcessor = new ErrorLogProcessor(null);
        LogProcessor debugLogProcessor = new DebugLogProcessor(errorLogProcessor);
        LogProcessor infoLogProcessor = new InfoLogProcessor(debugLogProcessor);

        infoLogProcessor.log(LogProcessor.INFO, "This is an information message");
        infoLogProcessor.log(LogProcessor.DEBUG, "This is a debug message");
        infoLogProcessor.log(LogProcessor.ERROR, "This is an error message");
    }
}
