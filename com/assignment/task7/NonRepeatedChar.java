package com.assignment.task7;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedChar {
    public static void main(String[] args) {
        String input = "swiss";  // We will take the hardcoded I/P and directly pass it inside the function def.
        findFirstNonRepeatedCharacter(input);   
    }

    public static void findFirstNonRepeatedCharacter(String input) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated character: " + entry.getKey());
                return;
            }
        }
        System.out.println("No non-repeated character found.");
    }
}
