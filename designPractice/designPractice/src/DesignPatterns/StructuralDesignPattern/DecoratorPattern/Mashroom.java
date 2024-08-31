package DesignPatterns.StructuralDesignPattern.DecoratorPattern;

public class Mashroom extends ToppingsDecorator{
    Pizza pizza;

    public Mashroom(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with Mashroom";
    }
}
