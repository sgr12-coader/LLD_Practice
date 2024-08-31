package DesignPatterns.CreationalDesignPattern.AbstractFactoryPattern;

public class AbstractFactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("Economic")) {
            return new EconomicCarFactory();
        } else if (factoryType.equalsIgnoreCase("Luxury")) {
            return new LuxuryEconomicCarFactory();
        }
        return null;
    }
}
