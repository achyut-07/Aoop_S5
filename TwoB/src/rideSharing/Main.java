package rideSharing;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("plase Login to book your ride");
     	User user = User.getInstance();
		System.out.print("Your user Name:- ");
		String s=sc.nextLine();
		user.signIn(s);
		System.out.println("Enter the vechicle type you want to travel with");
		System.out.println("1. Car");
		System.out.println("2. Bike");
		System.out.println("3. Scooty");
		System.out.print("Enter the choice:- ");
		int ele=sc.nextInt();
		VehicleFactory vf=null;
		switch(ele) {
		case 1: vf=new CarFactory();
		        break;
		case 2: vf=new BikeFactory();
                break;
		case 3: vf=new ScooterFactory();
                break;  
        default: System.out.println("Wrong choice relogin please");
                 user.signOut();
                 break;
		}
		if(user.isPresent()) {
			Vehicle v=vf.createVehicle();
			v.ride();
			System.out.println("Enter the Payment type you would like to proceed with");
			System.out.println("1. Upi");
			System.out.println("2. Cash");
			System.out.print("Enter the choice:- ");
			int ele2=sc.nextInt();
			PaymentFactory pf=null;
			switch(ele2) {
			case 1: pf=new UpiFactory();
			        break;
			case 2: pf=new CODFactory();
	                break; 
	        default: System.out.println("Wrong choice relogin please");
	                 user.signOut();
	                 break;
			}
			if(user.isPresent()) {
				Payment p=pf.createpayment();
				Recipt r=pf.createRecipt();
				System.out.print("Enter amount showed by driver:- ");
				double amount=sc.nextDouble();
				p.pay(amount);
				r.generateRecipt();
				user.signOut();
			}
		}
		
   }	
}
