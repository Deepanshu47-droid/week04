package com.votingsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VotingSystemTest {
    private VotingSystem votingSystem;

    @BeforeEach
    void setUp() {
        votingSystem = new VotingSystem();

        // Casting votes for initial setup
        votingSystem.castVote("Raj");
        votingSystem.castVote("Gagan");
        votingSystem.castVote("Shubham");
        votingSystem.castVote("Raj");
        votingSystem.castVote("Deepanshu");
        votingSystem.castVote("Gagan");
    }

    @Test
    void testCastVote() {
        votingSystem.castVote("Karan");
        Map<String, Integer> results = votingSystem.getResultsInInsertionOrder();
        assertTrue(results.containsKey("Karan"), "Vote for Karan should be recorded");
        assertEquals(1, results.get("Karan"), "Karan should have 1 vote");
    }

    @Test
    void testGetResultsInInsertionOrder() {
        Map<String, Integer> results = votingSystem.getResultsInInsertionOrder();
        assertEquals(4, results.size(), "There should be 4 unique candidates");
        assertEquals(2, results.get("Raj"), "Raj should have 2 votes");
        assertEquals(2, results.get("Gagan"), "Gagan should have 2 votes");
    }

    @Test
    void testGetResultsInSortedOrder() {
        Map<String, Integer> sortedResults = votingSystem.getResultsInSortedOrder();
        assertEquals(4, sortedResults.size(), "There should be 4 unique candidates");
        assertEquals("Deepanshu", sortedResults.keySet().iterator().next(), "The first candidate in sorted order should be Deepanshu");
    }

    @Test
    void testNoVotesCast() {
        VotingSystem emptyVotingSystem = new VotingSystem();
        assertTrue(emptyVotingSystem.getResultsInInsertionOrder().isEmpty(), "Results should be empty if no votes are cast");
        assertTrue(emptyVotingSystem.getResultsInSortedOrder().isEmpty(), "Sorted results should be empty if no votes are cast");
    }
}
