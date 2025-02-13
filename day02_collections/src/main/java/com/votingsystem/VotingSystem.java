package com.votingsystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// Class to simulate a voting system
public class VotingSystem {

    private Map<String, Integer> voteCount;

    // Constructor to initialize the vote count map
    public VotingSystem() {
        voteCount = new HashMap<>();
    }

    // Method to cast a vote for a candidate
    public void castVote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
    }

    // Method to display results in insertion order using LinkedHashMap
    public Map<String, Integer> getResultsInInsertionOrder() {
        return new LinkedHashMap<>(voteCount);
    }

    // Method to display results in sorted order using TreeMap
    public Map<String, Integer> getResultsInSortedOrder() {
        return new TreeMap<>(voteCount);
    }
}
