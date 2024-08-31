package DesignPatterns.BehavioralDesignPattern.MediatorPattern;

public interface AuctionMediator {
    void addBuyer(Colleague buyer);
    void bid(String buyer, int price);
}
