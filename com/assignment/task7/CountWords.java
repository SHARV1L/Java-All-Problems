package com.assignment.task7;

public class CountWords {
    public static void main(String[] args) {
        String input = "This is a sample sentence";
        countWords(input);
    }

    public static void countWords(String input) {
        String[] words = input.trim().split("\\s+"); // '\\s+' symbol is used to seperate(using split()) words in a String.
        System.out.println("Number of words: " + words.length);
    }
}
