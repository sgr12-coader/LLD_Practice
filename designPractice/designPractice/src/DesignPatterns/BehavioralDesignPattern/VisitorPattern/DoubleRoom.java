package DesignPatterns.BehavioralDesignPattern.VisitorPattern;

public class DoubleRoom implements HotelRoomElement{

        int roomPrice = 2000;

        @Override
        public void accept(HotelRoomVisitor hotelRoomVisitor) {
            hotelRoomVisitor.visit(this);
        }
}
