package com.BankManagement;

public class BankAccount {
	private double bal;
	public BankAccount(double iBal) {
        this.bal = iBal;
    }
	
	public synchronized void deposit(double amount) {
		 if (amount > 0) {
	            bal += amount;
	            System.out.println(Thread.currentThread().getName() + "deposited= " + amount + ", Current Balance = " + getBal());
	        }
	}
	
	public synchronized void withdraw(double amount) {
        if (amount > 0 && bal >= amount) {
            bal -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew= " + amount + ", Current Balance= " + getBal());
        } 
        else {
            System.out.println(Thread.currentThread().getName() + " attempted to withdraw= " + amount + ", but insufficient funds. Current Balance: " + getBal());
        }
    }
	
	public double getBal() {
        return bal;
    }

}
