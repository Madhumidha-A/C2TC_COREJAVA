package com.tnsif.ifet.bankingtransactionsystem;

public class Transaction {
	private static final double TRANSACTION_FEE = 2.5;

    // Final method to perform a transaction, cannot be overridden
    public final void performTransaction(Account account, double amount, boolean isDeposit) {
        if (isDeposit) {
            account.deposit(amount - TRANSACTION_FEE); // Apply transaction fee on deposit
        } else {
            account.withdraw(amount + TRANSACTION_FEE); // Apply transaction fee on withdrawal
        }
        System.out.println("Transaction completed. Transaction fee applied: " + TRANSACTION_FEE);
    }
}

