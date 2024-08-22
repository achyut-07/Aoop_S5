package bankingService;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		loginStatus lg=loginStatus.getInstance();
		Banking b=new Banking();
        while(true) {
        	System.out.println("...Choose Your option...");
        	System.out.println("1.Login");
        	System.out.println("2.Logout");
        	System.out.println("3.view Balance");
        	System.out.println("4.Deposit Money");
        	System.out.println("5.Withdraw Money");
        	System.out.print("Enter you choice:- ");
        	int n=sc.nextInt();
        	sc.nextLine();
        	switch(n) {
        	case 1:System.out.print("Enter your user name:- ");
        	       String s=sc.nextLine();
        	       lg.login(s);
        	       break;
        	case 2:lg.logout();
        	        break;
        	case 3:b.viewBalance();
        	       break;
        	case 4:System.out.print("Enter amount you want to deposit:- ");
        	       double x=sc.nextDouble();
        	       b.deposit(x);
        	       break;
        	case 5:System.out.print("Enter amount you want to withdraw:- ");
 	               double y=sc.nextDouble();
 	               b.withdraw(y);
 	               break;
            default:System.out.println("Wrong choice enterd");
                    break;

        	}
        }
      
	}
}
