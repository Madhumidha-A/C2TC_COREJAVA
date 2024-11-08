package com.tnsif.ifet.bankingtransactionsystem;

public class CheckingAccount extends Account {
	private static final double OVERDRAFT_LIMIT = 100.0;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance + OVERDRAFT_LIMIT >= amount) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
