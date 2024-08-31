package DesignPatterns.CreationalDesignPattern.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        AbstractFactory economicFactory = AbstractFactoryProducer.getFactory("Economic");
        Car economicCar = economicFactory.getCar(1000000);
        System.out.println("Economic Car Top Speed: " + economicCar.getTopSpeed());
        Car economicCar1 = economicFactory.getCar(100000);
        System.out.println("Economic Car Top Speed: " + economicCar1.getTopSpeed());

        AbstractFactory luxuryFactory = AbstractFactoryProducer.getFactory("Luxury");
        Car luxuryCar = luxuryFactory.getCar(2000000);
        System.out.println("Luxury Car Top Speed: " + luxuryCar.getTopSpeed());
        Car luxuryCar1 = luxuryFactory.getCar(2500000);
        System.out.println("Luxury Car Top Speed: " + luxuryCar1.getTopSpeed());
    }
}
