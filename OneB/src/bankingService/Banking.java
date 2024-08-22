package bankingService;

public class Banking {
    private double bal;
    public void viewBalance() {
    	loginStatus lg=loginStatus.getInstance();
    	if(lg.isLoggedIn()) {
    		System.out.println("The Current Bank balance is:- ₹"+bal);
    	}
    	else {
    		System.out.println("No User Currently Logged in to view Balance");
    	}
    }
    
    public void deposit(double amount) {
    	loginStatus lg=loginStatus.getInstance();
    	if(lg.isLoggedIn()) {
    		bal+=amount;
    		System.out.println("Deposited ₹"+amount+"to "+lg.getUsername()+"'s account");
    	}
    	else {
    		System.out.println("You must be logged in to your account to deposit the money");
    	}
    }
    
    public void withdraw(double amount) {
    	loginStatus lg=loginStatus.getInstance();
    	if(lg.isLoggedIn()) {
    		if(amount>bal) {
    			System.out.println("Insufficient balance");
    		}
    		else {
    			bal-=amount;
    			System.out.println("Withdrawl of ₹"+amount+" Was suceesfull");
    		}
    	}
    	else {
    		System.out.println("You must be logged in to withdraw the money");
    	}
    }
    
}
