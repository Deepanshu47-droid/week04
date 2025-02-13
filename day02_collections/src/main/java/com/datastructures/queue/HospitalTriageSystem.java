package com.datastructures.queue;

import java.util.PriorityQueue;
import java.util.Comparator;

// Class to simulate a hospital triage system
public class HospitalTriageSystem {

    // Main method to demonstrate the hospital triage system
    public static void main(String[] args) {
        // Creating a PriorityQueue with a custom comparator for severity (higher severity first)
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(Comparator.comparingInt(Patient::getSeverity).reversed());

        // Adding patients to the queue
        triageQueue.add(new Patient("Kisna", 3));
        triageQueue.add(new Patient("Deepanshu", 5));
        triageQueue.add(new Patient("Raj", 2));

        // Displaying and treating patients based on severity
        System.out.println("Patients treated in order of severity:");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.remove());
        }
    }
}
