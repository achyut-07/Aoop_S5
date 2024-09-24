package com.BankManagement;

public class User implements Runnable {
	private BankAccount acc;
    private boolean deposit; 
    private double amount;

    public User(BankAccount acc, boolean deposit, double amount) {
        this.acc = acc;
        this.deposit = deposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (deposit) {
            acc.deposit(amount);
        } 
        else {
            acc.withdraw(amount);
        }
    }
}
