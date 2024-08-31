package DesignPatterns.StructuralDesignPattern.FacadePattern.ACFacade;

public class ACInternalUnit {
    void checkTemperature() {
        System.out.println("Checking temperature");
    }

    void startAC() {
        System.out.println("Starting AC");
    }

    void offAC() {
        System.out.println("Turning off AC");
    }

    void startCompressor() {
        System.out.println("Starting compressor");
    }
}
