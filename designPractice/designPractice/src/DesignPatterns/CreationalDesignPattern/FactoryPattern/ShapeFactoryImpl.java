package DesignPatterns.CreationalDesignPattern.FactoryPattern;

public class ShapeFactoryImpl implements ShapeFactory{
    @Override
    public Shape getShape(String shapeType){
        switch (shapeType){
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
