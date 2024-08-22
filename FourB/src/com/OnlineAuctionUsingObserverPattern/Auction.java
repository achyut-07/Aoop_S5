package com.OnlineAuctionUsingObserverPattern;

public interface Auction {
	void add(Bidder bidder);
	void remove(Bidder bidder);
	void notifyBidders();

}
