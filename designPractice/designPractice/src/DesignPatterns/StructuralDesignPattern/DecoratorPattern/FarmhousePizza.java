package DesignPatterns.StructuralDesignPattern.DecoratorPattern;

public class FarmhousePizza extends Pizza {
    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "Farmhouse Pizza";
    }
}
