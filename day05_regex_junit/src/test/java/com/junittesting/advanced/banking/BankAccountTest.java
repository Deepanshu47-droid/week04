package com.junittesting.advanced.banking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    void testWithdrawValidAmount() {
        BankAccount account = new BankAccount(1000);
        account.withdraw(400);
        assertEquals(600, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(300);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(500));
    }

    @Test
    void testNegativeDeposit() {
        BankAccount account = new BankAccount(1000);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-200));
    }

    @Test
    void testNegativeWithdrawal() {
        BankAccount account = new BankAccount(1000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-300));
    }
}
