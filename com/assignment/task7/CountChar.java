package com.assignment.task7;

import java.util.HashMap;
import java.util.Map;

public class CountChar {
    public static void main(String[] args) {
        String input = "occurrence";
        countCharacterOccurrences(input);
    }

    public static void countCharacterOccurrences(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character Occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
