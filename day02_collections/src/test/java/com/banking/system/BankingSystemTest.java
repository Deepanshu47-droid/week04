package com.banking.system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BankingSystemTest {
    private BankingSystem bankingSystem;

    @BeforeEach
    void setUp() {
        bankingSystem = new BankingSystem();
    }

    @Test
    void testAddAccount() {
        bankingSystem.addAccount("ACC1001", 50000.00);
        bankingSystem.addAccount("ACC1002", 75000.00);

        Map<String, Double> accounts = bankingSystem.getAccounts();

        assertEquals(2, accounts.size(), "There should be 2 accounts");
        assertEquals(50000.00, accounts.get("ACC1001"), "Balance for ACC1001 should be ₹50000.00");
        assertEquals(75000.00, accounts.get("ACC1002"), "Balance for ACC1002 should be ₹75000.00");
    }

    @Test
    void testAddAccountOverwrite() {
        bankingSystem.addAccount("ACC1001", 50000.00);
        bankingSystem.addAccount("ACC1001", 60000.00);  // Overwriting the balance

        Map<String, Double> accounts = bankingSystem.getAccounts();

        assertEquals(1, accounts.size(), "There should be 1 account");
        assertEquals(60000.00, accounts.get("ACC1001"), "Balance for ACC1001 should be ₹60000.00");
    }

    @Test
    void testGetAccountsEmpty() {
        Map<String, Double> accounts = bankingSystem.getAccounts();
        assertTrue(accounts.isEmpty(), "Accounts map should be empty initially");
    }
}
