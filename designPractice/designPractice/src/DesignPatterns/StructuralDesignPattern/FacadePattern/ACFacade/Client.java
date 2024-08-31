package DesignPatterns.StructuralDesignPattern.FacadePattern.ACFacade;

public class Client {
    public static void main(String[] args) {
        ACFacade acFacade = new ACFacade();
        acFacade.startAC();
    }
}
