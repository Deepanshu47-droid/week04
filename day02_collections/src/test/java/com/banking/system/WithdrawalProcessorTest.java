package com.banking.system;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import static org.junit.jupiter.api.Assertions.*;

class WithdrawalProcessorTest {

    @Test
    void testProcessWithdrawals() {
        Map<String, Double> accounts = new HashMap<>();
        accounts.put("ACC1001", 50000.00);
        accounts.put("ACC1002", 75000.00);

        Queue<String> withdrawalRequests = new LinkedList<>();
        withdrawalRequests.add("ACC1001");
        withdrawalRequests.add("ACC1002");
        withdrawalRequests.add("ACC9999");  // Non-existing account

        // Processing withdrawals (we'll just check for the account presence here)
        WithdrawalProcessor.processWithdrawals(withdrawalRequests, accounts);

        assertEquals(0, withdrawalRequests.size(), "All withdrawal requests should be processed");
    }

    @Test
    void testProcessWithdrawalsEmptyQueue() {
        Map<String, Double> accounts = new HashMap<>();
        Queue<String> withdrawalRequests = new LinkedList<>();

        // Processing withdrawals with an empty queue
        WithdrawalProcessor.processWithdrawals(withdrawalRequests, accounts);

        assertTrue(withdrawalRequests.isEmpty(), "Queue should remain empty");
    }

    @Test
    void testProcessWithdrawalsNonExistingAccount() {
        Map<String, Double> accounts = new HashMap<>();
        accounts.put("ACC1001", 50000.00);

        Queue<String> withdrawalRequests = new LinkedList<>();
        withdrawalRequests.add("ACC9999");  // Non-existing account

        // Capturing the console output for verification
        WithdrawalProcessor.processWithdrawals(withdrawalRequests, accounts);

        // Verifying the queue is processed
        assertTrue(withdrawalRequests.isEmpty(), "Queue should be processed even for non-existing accounts");
    }
}
