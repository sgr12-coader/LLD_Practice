package DesignPatterns.BehavioralDesignPattern.VisitorPattern;

public class SuiteRoom implements HotelRoomElement{
    int roomPrice = 3000;

        @Override
        public void accept(HotelRoomVisitor hotelRoomVisitor) {
            hotelRoomVisitor.visit(this);
        }
}
