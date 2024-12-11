package com.assignment.task7;

import java.util.HashSet;

public class UniqueChars {
    public static void main(String[] args) {
        String input = "hello";
        checkUniqueCharacters(input);
    }

    public static void checkUniqueCharacters(String input) {
        HashSet<Character> charSet = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (!charSet.add(c)) {
                System.out.println("The string does not have all unique characters.");
                return;
            }
        }
        System.out.println("The string has all unique characters.");
    }
}