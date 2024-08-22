package com.OnlineAuctionUsingTemplatePattern;

public class ReserveAuction extends AuctionProcess{

	@Override
	protected void initializeAuction() {
		System.out.println("Initializing the reserved auction the bidding yet to begin...");
	}

	@Override
	protected void startBidding() {
		System.out.println("The bidding has now began in reserved auction ");
	}

	@Override
	protected void endBidding() {
		System.out.println("The bidding has now ended in reserved auction");
	}

	@Override
	protected void announceWinner() {
		// TODO Auto-generated method stub
		System.out.println("Announcing the winner of reserved auction");
	}

}
