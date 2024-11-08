package com.tnsif.ifet.bankingtransactionsystem;
public abstract class Account {
	    protected double balance;

	    public Account(double initialBalance) {
	        this.balance = initialBalance;
	        Bank.incrementTotalAccounts();
	    }

	    // Abstract methods
	    public abstract void deposit(double amount);

	    public abstract void withdraw(double amount);

	    public abstract double getBalance();

	    // Concrete method for showing balance
	    public void showBalance() {
	        System.out.println("Current balance: " + getBalance());
	    }
	}


