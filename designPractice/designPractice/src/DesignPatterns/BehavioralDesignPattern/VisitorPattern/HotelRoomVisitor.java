package DesignPatterns.BehavioralDesignPattern.VisitorPattern;

public interface HotelRoomVisitor {
    void visit(SingleRoom singleRoom);
    void visit(DoubleRoom doubleRoom);
    void visit(SuiteRoom suiteRoom);
}
