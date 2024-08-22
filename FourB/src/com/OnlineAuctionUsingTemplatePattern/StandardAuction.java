package com.OnlineAuctionUsingTemplatePattern;

public class StandardAuction extends AuctionProcess{

	@Override
	protected void initializeAuction() {
		System.out.println("Initializing the standard auction the bidding yet to begin....");
	}

	@Override
	protected void startBidding() {
		System.out.println("Bidding started for standard auction bid your amount");
	}

	@Override
	protected void endBidding() {
		// TODO Auto-generated method stub
		System.out.println("The bidding has now been ended thankyou for the participation");
	}

	@Override
	protected void announceWinner() {
		// TODO Auto-generated method stub
		System.out.println("The winner of these standard auction is being announced");
	}

}
