package DesignPatterns.StructuralDesignPattern.FacadePattern.ACFacade;

public class ACFacade {
    ACExternalUnit acExternalUnit;
    ACInternalUnit acInternalUnit;

    public ACFacade() {
        acExternalUnit = new ACExternalUnit();
        acInternalUnit = new ACInternalUnit();
    }

    public void startAC() {
        acExternalUnit.checkVoltage();
        acInternalUnit.checkTemperature();
        acInternalUnit.startAC();
        acInternalUnit.startCompressor();
        acExternalUnit.consumeGas();
        acExternalUnit.startCooling();
    }
}
