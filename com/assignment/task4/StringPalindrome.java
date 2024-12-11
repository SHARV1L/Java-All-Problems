package com.assignment.task4;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        checkPalindrome(); // Calling the task-specific function
    }

    public static void checkPalindrome() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a string:");
            String input = scanner.nextLine();
            String reversed = new StringBuilder(input).reverse().toString();

            if (input.equals(reversed)) {
                System.out.println("The string \"" + input + "\" is a palindrome.");
            } else {
                System.out.println("The string \"" + input + "\" is not a palindrome.");
            }
        } finally {
            scanner.close();
        }
    }
}
