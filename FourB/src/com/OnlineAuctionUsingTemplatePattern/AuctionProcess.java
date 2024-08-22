package com.OnlineAuctionUsingTemplatePattern;

public abstract class AuctionProcess {
	
	public final void conductAuction() {
		initializeAuction();
		startBidding();
		endBidding();
		announceWinner();
		
	}

	protected abstract void initializeAuction();
	protected abstract void startBidding();
	protected abstract void endBidding();
	protected abstract void announceWinner();
	

}
