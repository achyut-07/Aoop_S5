package com.OnlineAuctionUsingObserverPattern;
import java.util.*;
public class ConcreteAuction implements Auction{
	private ArrayList<Bidder> bidders = new ArrayList<>();
	private String event;

	@Override
	public void add(Bidder bidder) {
		bidders.add(bidder);
		
	}

	@Override
	public void remove(Bidder bidder) {
		bidders.remove(bidder);
		System.out.println("Rmoved bidder");
	}

	@Override
	public void notifyBidders() {
		// TODO Auto-generated method stub
		for(Bidder bidder:bidders) {
			bidder.update(event);
		}
	}
	public void setAuctionEvent(String event){
		this.event=event;
		notifyBidders();
		
	}

}
