package com.OnlineAuctionUsingObserverPattern;

public class Main1 {
	public static void main(String[] args) {
		ConcreteAuction auction = new ConcreteAuction();

	    Bidder bidder1=new ConcreteBidder("Pawan Achyutanand");
	    Bidder bidder2=new ConcreteBidder("Vijay");
	    Bidder bidder3=new ConcreteBidder("Barhamatej");

	    auction.add(bidder1);
	    auction.add(bidder2);
	    auction.add(bidder3);

	    auction.setAuctionEvent("Item is now available for bidding please be present at venue!");
	    auction.setAuctionEvent("Bidding has now begun!");
	    
	    auction.remove(bidder1);

	    auction.setAuctionEvent("Bidding has been ended thankyou for participation!");
	}

}
