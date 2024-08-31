package DesignPatterns.BehavioralDesignPattern.VisitorPattern;

public interface HotelRoomElement {
    void accept(HotelRoomVisitor hotelRoomVisitor);
}
