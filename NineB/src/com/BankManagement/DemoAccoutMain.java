package com.BankManagement;

public class DemoAccoutMain {
	public static void main(String[] args) {
        BankAccount acc = new BankAccount(7000);
        Thread u1 = new Thread(new User(acc, true, 200), "User 1");
        Thread u2 = new Thread(new User(acc, false, 300), "User 2");
        Thread u3 = new Thread(new User(acc, true, 150), "User 3");
        Thread u4 = new Thread(new User(acc, false, 700), "User 4");
        u1.start();
        u2.start();
        u3.start();
        u4.start();

	}
	
	
}
