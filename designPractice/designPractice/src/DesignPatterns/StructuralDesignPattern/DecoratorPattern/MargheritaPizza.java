package DesignPatterns.StructuralDesignPattern.DecoratorPattern;

public class MargheritaPizza extends Pizza {
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }
}
