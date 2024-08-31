package DesignPatterns.BehavioralDesignPattern.MediatorPattern;

public class Bidder implements Colleague{
    private final String name;
    private final AuctionMediator auctionMediator;

    public Bidder(AuctionMediator auctionMediator, String name) {
        this.auctionMediator = auctionMediator;
        this.name = name;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " : " + message);
    }

    @Override
    public void bid(int amount) {
        auctionMediator.bid(name, amount);
    }

    @Override
    public String getName() {
        return name;
    }
}
