package DesignPatterns.BehavioralDesignPattern.ChainResponsibilityPattern;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == DEBUG) {
            System.out.println("Debug: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
