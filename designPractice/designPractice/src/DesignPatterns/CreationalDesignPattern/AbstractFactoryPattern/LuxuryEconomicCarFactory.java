package DesignPatterns.CreationalDesignPattern.AbstractFactoryPattern;

public class LuxuryEconomicCarFactory implements AbstractFactory{
    @Override
    public Car getCar(int price) {
        if(price > 1500000 && price <= 2000000){
            return new Coupe();
        }else{
            return new Convrtable();
        }
    }
}
