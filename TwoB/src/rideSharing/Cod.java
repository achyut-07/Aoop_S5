package rideSharing;

public class Cod implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid the driver ₹"+amount+" using cash after the ride");
		
	}

}
