package DesignPatterns.BehavioralDesignPattern.NullObjectPattern;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) {
        switch (vehicleType) {
            case "Car":
                return new Car();
            case "Bike":
                return new Bike();
            default:
                return new NullVehicle();
        }
    }
}
