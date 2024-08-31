package DesignPatterns.BehavioralDesignPattern.VisitorPattern;

public class Main {
    public static void main(String[] args) {
        HotelRoomElement singleRoom = new SingleRoom();
        HotelRoomElement doubleRoom = new DoubleRoom();
        HotelRoomElement suiteRoom = new SuiteRoom();

        HotelRoomVisitor hotelRoomVisitor = new HotelRoomGuestVisitor();
        singleRoom.accept(hotelRoomVisitor);
        doubleRoom.accept(hotelRoomVisitor);
        suiteRoom.accept(hotelRoomVisitor);
        System.out.println();
        HotelRoomVisitor hotelRoomVisitor2 = new HotelRoomMaintenanceVisitor();
        singleRoom.accept(hotelRoomVisitor2);
        doubleRoom.accept(hotelRoomVisitor2);
        suiteRoom.accept(hotelRoomVisitor2);

    }
}
