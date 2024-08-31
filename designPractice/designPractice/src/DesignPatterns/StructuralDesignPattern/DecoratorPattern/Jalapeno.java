package DesignPatterns.StructuralDesignPattern.DecoratorPattern;

public class Jalapeno extends ToppingsDecorator{
    Pizza pizza;

    public Jalapeno(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 40;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with Jalapeno";
    }
}
