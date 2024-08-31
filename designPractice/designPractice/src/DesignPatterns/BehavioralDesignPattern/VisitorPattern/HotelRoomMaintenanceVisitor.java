package DesignPatterns.BehavioralDesignPattern.VisitorPattern;

public class HotelRoomMaintenanceVisitor implements HotelRoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Maintaining Single Room");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Maintaining Double Room");
    }

    @Override
    public void visit(SuiteRoom suiteRoom) {
        System.out.println("Maintaining Suite Room");
    }
}
