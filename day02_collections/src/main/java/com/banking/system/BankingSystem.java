package com.banking.system;

import java.util.HashMap;
import java.util.Map;

// Class to manage customer accounts and balances
public class BankingSystem {
    private Map<String, Double> accounts;

    // Constructor to initialize the accounts map
    public BankingSystem() {
        accounts = new HashMap<>();
    }

    // Method to add a customer account with an initial balance
    public void addAccount(String accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
    }

    // Method to get the map of accounts
    public Map<String, Double> getAccounts() {
        return accounts;
    }
}
