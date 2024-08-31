package DesignPatterns.StructuralDesignPattern.DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Pizza farmhousePizza = new FarmhousePizza();
        farmhousePizza = new ExtraCheese(farmhousePizza);
        farmhousePizza = new Mashroom(farmhousePizza);
        farmhousePizza = new Jalapeno(farmhousePizza);
        farmhousePizza = new Onion(farmhousePizza);
        System.out.println(farmhousePizza.getDescription() + " Cost: " + farmhousePizza.getCost());
        System.out.println();

        Pizza margheritaPizza = new ExtraCheese(new Mashroom(new MargheritaPizza()));
        System.out.println(margheritaPizza.getDescription() + " Cost: " + margheritaPizza.getCost());
    }
}
