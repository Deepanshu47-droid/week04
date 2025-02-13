package com.banking.system;

import java.util.Map;
import java.util.Queue;

// Class to process withdrawal requests
public class WithdrawalProcessor {

    // Method to process withdrawal requests
    public static void processWithdrawals(Queue<String> withdrawalRequests, Map<String, Double> accounts) {
        while (!withdrawalRequests.isEmpty()) {
            String accountNumber = withdrawalRequests.poll();

            // Checking if the account exists
            if (accounts.containsKey(accountNumber)) {
                System.out.println("Processing withdrawal for account: " + accountNumber);
            } else {
                System.out.println("Account not found: " + accountNumber);
            }
        }
    }
}
