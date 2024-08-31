package DesignPatterns.BehavioralDesignPattern.NullObjectPattern;

public class Main {
    public static void main(String[] args) {
        /*
        Vehicle vehicle;
        if vehicle != null {
            System.out.println("Car Tank Capacity: " + vehicle.getTankCapacity());
            System.out.println("Car Seating Capacity: " + vehicle.getSeatingCapacity());
            System.out.println();
        }
        here we hve removed the null check and used the NullVehicle class to handle the null object
        */

        Vehicle vehicle = VehicleFactory.getVehicle("Car");
        System.out.println("Car Tank Capacity: " + vehicle.getTankCapacity());
        System.out.println("Car Seating Capacity: " + vehicle.getSeatingCapacity());
        System.out.println();
        vehicle = VehicleFactory.getVehicle("Bike");
        System.out.println("Bike Tank Capacity: " + vehicle.getTankCapacity());
        System.out.println("Bike Seating Capacity: " + vehicle.getSeatingCapacity());
        System.out.println();
        vehicle = VehicleFactory.getVehicle("");
        System.out.println("Null Object Tank Capacity: " + vehicle.getTankCapacity());
        System.out.println("Null Object Seating Capacity: " + vehicle.getSeatingCapacity());
    }
}
