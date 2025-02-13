package com.datastructures.Queue;

import com.datastructures.queue.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.PriorityQueue;
import java.util.Comparator;
import static org.junit.jupiter.api.Assertions.*;

class HospitalTriageSystemTest {
    private PriorityQueue<Patient> triageQueue;

    @BeforeEach
    void setUp() {
        // Initializing the triage queue with a custom comparator for severity (higher severity first)
        triageQueue = new PriorityQueue<>(Comparator.comparingInt(Patient::getSeverity).reversed());
    }

    @Test
    void testPatientOrderBySeverity() {
        // Adding patients to the queue
        triageQueue.add(new Patient("Kisna", 3));
        triageQueue.add(new Patient("Deepanshu", 5));
        triageQueue.add(new Patient("Raj", 2));

        // Verifying that patients are treated in the order of their severity
        assertEquals("Patient{name='Deepanshu', severity=5}", triageQueue.remove().toString(), "First patient should be Deepanshu with severity 5");
        assertEquals("Patient{name='Kisna', severity=3}", triageQueue.remove().toString(), "Second patient should be Kisna with severity 3");
        assertEquals("Patient{name='Raj', severity=2}", triageQueue.remove().toString(), "Third patient should be Raj with severity 2");
    }

    @Test
    void testEmptyQueue() {
        // Verifying that the queue is initially empty
        assertTrue(triageQueue.isEmpty(), "Queue should be empty initially");

        // Attempting to remove from an empty queue
        Exception exception = assertThrows(Exception.class, () -> {
            triageQueue.remove();
        });
        assertTrue(exception instanceof java.util.NoSuchElementException, "Should throw NoSuchElementException when removing from an empty queue");
    }

    @Test
    void testSinglePatient() {
        // Adding a single patient
        triageQueue.add(new Patient("Yogesh", 4));

        // Verifying the order for a single patient
        assertEquals("Patient{name='Yogesh', severity=4}", triageQueue.remove().toString(), "Only patient should be Yogesh with severity 4");
        assertTrue(triageQueue.isEmpty(), "Queue should be empty after removing the only patient");
    }
}
