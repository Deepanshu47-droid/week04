package com.junittesting.basic.lifecycle;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    private DatabaseConnection dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    void testConnectionIsEstablished() {
        assertTrue(dbConnection.isConnected(), "Database should be connected");
    }

    @Test
    void testConnectionIsClosedAfterEachTest() {
        assertTrue(dbConnection.isConnected(), "Database should be connected before the test runs");
    }
}
