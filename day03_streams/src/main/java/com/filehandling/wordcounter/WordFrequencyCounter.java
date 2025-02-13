package com.filehandling.wordcounter;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        // Specifying the file path
        String filePath = "C:\\Users\\Lenovo\\Desktop\\capgemini\\classroom\\week04-copy\\day03_streams\\src\\main\\java\\com\\filehandling\\wordcounter\\large.txt";

        // Creating a HashMap to store word frequencies
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Reading the file and counting word occurrences
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Splitting the line into words using spaces and punctuation as delimiters
                String[] words = line.toLowerCase().split("[\\s.,!?;:()\"'-]+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        // Incrementing the count for each word
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Sorting the words by frequency in descending order
            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
            sortedWords.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

            // Displaying the top 5 most frequently occurring words
            System.out.println("Top 5 most frequently occurring words:");
            for (int i = 0; i < Math.min(5, sortedWords.size()); i++) {
                Map.Entry<String, Integer> entry = sortedWords.get(i);
                System.out.println(entry.getKey() + " - " + entry.getValue() + " occurrences");
            }
        } catch (IOException e) {
            // Handling exceptions related to file operations
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
