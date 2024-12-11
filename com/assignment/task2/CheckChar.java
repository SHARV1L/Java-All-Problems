package com.assignment.task2;

public class CheckChar {
    public static void main(String[] args) {
        checkAlphabet('A'); 
    }

    public static void checkAlphabet(char character) {
        try {
            if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
                System.out.println(character + " is an alphabet.");
            } else {
                System.out.println(character + " is not an alphabet.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
