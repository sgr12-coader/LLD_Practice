package DesignPatterns.CreationalDesignPattern.AbstractFactoryPattern;

public class EconomicCarFactory implements AbstractFactory{
    @Override
    public Car getCar(int price) {
        if(price <= 1000000 && price > 500000){
            return new SUVCar();
        }else{
            return new SedanCar();
        }
    }
}
