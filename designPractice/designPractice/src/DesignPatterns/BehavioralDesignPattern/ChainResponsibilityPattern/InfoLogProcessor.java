package DesignPatterns.BehavioralDesignPattern.ChainResponsibilityPattern;

public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == INFO) {
            System.out.println("Info: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
