package com.assignment.task7;

public class StringPermutations {
    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Permutations of the string \"" + input + "\":");
        printPermutations(input, "");
    }

    public static void printPermutations(String str, String prefix) {
        if (str.isEmpty()) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            printPermutations(remaining, prefix + currentChar);
        }
    }    
}
