package DesignPatterns.BehavioralDesignPattern.MediatorPattern;

public class Main {
    public static void main(String[] args) {
        AuctionMediator mediator = new Auction();
        Colleague buyer1 = new Bidder(mediator, "Buyer 1");
        Colleague buyer2 = new Bidder(mediator, "Buyer 2");
        Colleague buyer3 = new Bidder(mediator, "Buyer 3");

        mediator.addBuyer(buyer1);
        mediator.addBuyer(buyer2);
        mediator.addBuyer(buyer3);

        buyer1.bid(1000);
        System.out.println();
        buyer2.bid(2000);
        System.out.println();
        buyer3.bid(3000);
        System.out.println();
        buyer1.bid(100);

    }
}
