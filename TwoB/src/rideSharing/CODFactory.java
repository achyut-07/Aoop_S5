package rideSharing;

public class CODFactory extends PaymentFactory {

	@Override
	public Payment createpayment() {
		return new Cod();
	}

	@Override
	public Recipt createRecipt() {
		return new CodRecipt();
	}

}
