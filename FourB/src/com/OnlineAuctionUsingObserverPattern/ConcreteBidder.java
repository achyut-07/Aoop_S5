package com.OnlineAuctionUsingObserverPattern;

public class ConcreteBidder implements Bidder{
	private String Name;
	public ConcreteBidder(String Name) {
		this.Name=Name;
	}

	@Override
	public void update(String event) {
		// TODO Auto-generated method stub
		System.out.println("Bidder " + Name + " received update: " + event);
	}
	
	public String getName() {
		return Name;
	}

}
