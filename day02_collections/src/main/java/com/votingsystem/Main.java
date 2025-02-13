package com.votingsystem;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Casting votes using preferred names
        votingSystem.castVote("Raj");
        votingSystem.castVote("Gagan");
        votingSystem.castVote("Shubham");
        votingSystem.castVote("Raj");
        votingSystem.castVote("Deepanshu");
        votingSystem.castVote("Gagan");

        // Displaying results in insertion order
        System.out.println("Results in Insertion Order:");
        votingSystem.getResultsInInsertionOrder().forEach((candidate, votes) ->
                System.out.println(candidate + ": " + votes));

        // Displaying results in sorted order
        System.out.println("\nResults in Sorted Order:");
        votingSystem.getResultsInSortedOrder().forEach((candidate, votes) ->
                System.out.println(candidate + ": " + votes));
    }
}
