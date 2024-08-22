package rideSharing;

public class User {
	private static User instance;
	private boolean isPresent;
	private User() {
		this.isPresent=false;
	}
	public static User getInstance() {
		if(instance==null) instance=new User();
		return instance;
	}
	
	public void signIn(String userName) {
		 this.isPresent=true;
		 System.out.println(userName+" has been sucessfully logged in");
	}
	
	public void signOut() {
		this.isPresent=false;
		System.out.println("Logged out sucessfully Thank you for chossing us please re login again for a new ride");
		System.out.println("Your ride ended safely and sucessfully ");
	}
	public boolean isPresent() {
        return this.isPresent;
    }
}
