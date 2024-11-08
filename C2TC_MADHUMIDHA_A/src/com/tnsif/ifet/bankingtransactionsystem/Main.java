package com.tnsif.ifet.bankingtransactionsystem;

public class Main {
	public static void main(String[] args) {
        // Creating accounts
        SavingAccount savingsAccount = new SavingAccount(1000);
        CheckingAccount checkingAccount = new CheckingAccount(500);

        // Displaying total accounts
        System.out.println("Total accounts created: " + Bank.getTotalAccounts());

        // Performing transactions
        Transaction transaction = new Transaction();

        // Deposit and withdraw on Savings Account
        transaction.performTransaction(savingsAccount, 200, true); // Deposit
        savingsAccount.showBalance();
        transaction.performTransaction(savingsAccount, 150, false); // Withdraw
        savingsAccount.showBalance();

        // Deposit and withdraw on Checking Account
        transaction.performTransaction(checkingAccount, 300, true); // Deposit
        checkingAccount.showBalance();
        transaction.performTransaction(checkingAccount, 400, false); // Withdraw
        checkingAccount.showBalance();

        // Final total accounts after transactions
        System.out.println("Final total accounts: " + Bank.getTotalAccounts());
    }
}


