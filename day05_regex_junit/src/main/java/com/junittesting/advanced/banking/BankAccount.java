package com.junittesting.advanced.banking;

//BankAccount class to manage deposits, withdrawals, and balance checking
public class BankAccount {
    private double balance; // Storing account balance

    //method to Initialize account with an initial balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    //Method to money to the balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
    }

    //method to Withdraw money from the balance
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        balance -= amount;
    }

    // method to Return the current balance
    public double getBalance() {
        return balance;
    }
}
