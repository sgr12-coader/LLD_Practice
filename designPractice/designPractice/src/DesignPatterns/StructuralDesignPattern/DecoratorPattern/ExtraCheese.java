package DesignPatterns.StructuralDesignPattern.DecoratorPattern;

public class ExtraCheese extends ToppingsDecorator{
    Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with Extra Cheese";
    }
}
