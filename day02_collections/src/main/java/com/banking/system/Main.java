package com.banking.system;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();

        // Adding customer accounts with initial balances
        bankingSystem.addAccount("ACC1001", 50000.00);
        bankingSystem.addAccount("ACC1002", 75000.00);
        bankingSystem.addAccount("ACC1003", 30000.00);
        bankingSystem.addAccount("ACC1004", 100000.00);

        // Displaying accounts and balances
        System.out.println("Customer Accounts:");
        bankingSystem.getAccounts().forEach((account, balance) ->
                System.out.println(account + ": ₹" + balance));

        // Creating a queue for withdrawal requests
        Queue<String> withdrawalRequests = new LinkedList<>();
        withdrawalRequests.add("ACC1001");
        withdrawalRequests.add("ACC1003");
        withdrawalRequests.add("ACC1005");  // This account does not exist

        // Processing withdrawal requests
        System.out.println("\nProcessing Withdrawal Requests:");
        WithdrawalProcessor.processWithdrawals(withdrawalRequests, bankingSystem.getAccounts());
    }
}
