package rideSharing;

public class UpiFactory extends PaymentFactory {

	@Override
	public Payment createpayment() {
		
		return new Upi();
	}

	@Override
	public Recipt createRecipt() {
		
		return new UpiRecipt();
	}

}
