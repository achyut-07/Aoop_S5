package rideSharing;

public class Upi implements Payment{

	@Override
	public void pay(double amount) {
      System.out.println("Paid the driver ₹"+amount+" using upi payment" );		
	}

}
