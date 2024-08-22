package com.OnlineAuctionUsingTemplatePattern;

public class Main {
	
	public static void main(String[] args) {
		AuctionProcess standardAuction=new StandardAuction();
		standardAuction.conductAuction();
		
		AuctionProcess reserveAuction=new ReserveAuction();
		reserveAuction.conductAuction();
	}

}
