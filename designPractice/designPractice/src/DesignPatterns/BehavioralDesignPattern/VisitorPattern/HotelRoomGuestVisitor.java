package DesignPatterns.BehavioralDesignPattern.VisitorPattern;

public class HotelRoomGuestVisitor implements HotelRoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Visiting Single Room "+ singleRoom.roomPrice);
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Visiting Double Room "+ doubleRoom.roomPrice);
    }

    @Override
    public void visit(SuiteRoom suiteRoom) {
        suiteRoom.roomPrice=5000; // 5000 is the new price for Suite Room similar way we can change the price/properties of other rooms/objects
        System.out.println("Visiting Suite Room "+ suiteRoom.roomPrice);
    }
}
