package DesignPatterns.BehavioralDesignPattern.VisitorPattern;

public class SingleRoom implements HotelRoomElement{
    int roomPrice = 1000;
    @Override
    public void accept(HotelRoomVisitor hotelRoomVisitor) {
        hotelRoomVisitor.visit(this);
    }
}
