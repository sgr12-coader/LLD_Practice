package DesignPatterns.BehavioralDesignPattern.MediatorPattern;

import java.util.*;

public class Auction implements AuctionMediator{
    private final List<Colleague> bidders;
    private Bidder highestBidder;
    private int highestBid;

    public Auction() {
        bidders = new ArrayList<>();
    }

    @Override
    public void addBuyer(Colleague buyer) {
        bidders.add(buyer);
    }

    @Override
    public void bid(String buyer, int price) {
        if (highestBidder == null) {
            highestBidder = (Bidder) bidders.stream().filter(bidder -> bidder.getName().equals(buyer)).findFirst().get();
            highestBid = price;
            bidders.forEach(bidder -> bidder.receiveMessage(buyer + " has placed a bid of " + price));
        } else if (price > highestBid) {
            bidders.forEach(bidder -> bidder.receiveMessage(buyer + " has placed a bid of " + price));
            highestBidder = (Bidder) bidders.stream().filter(bidder -> bidder.getName().equals(buyer)).findFirst().get();
            highestBid = price;
        } else {
            bidders.forEach(bidder -> bidder.receiveMessage("The current highest bid is " + highestBid + " by " + highestBidder.getName()));
        }
    }
}
