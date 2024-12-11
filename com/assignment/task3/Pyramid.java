package com.assignment.task3;

public class Pyramid {
    public static void main(String[] args) {
        int rows = 4; // Number of rows
        // Here, we will first print a left aligned triangle followed by a right aligned traingle.

        for (int i = 1; i <= rows; i++) {
            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Print spaces
            int spaces = 2 * (rows - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
