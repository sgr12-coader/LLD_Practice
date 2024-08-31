package DesignPatterns.StructuralDesignPattern.DecoratorPattern;

public class Onion extends ToppingsDecorator{
    Pizza pizza;

    public Onion(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with Onion";
    }
}
