package DesignPatterns.StructuralDesignPattern.DecoratorPattern;

public class VegDelightPizza extends Pizza {
    @Override
    public int getCost() {
        return 300;
    }

    @Override
    public String getDescription() {
        return "Veg Delight Pizza";
    }
}
