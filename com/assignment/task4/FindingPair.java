package com.assignment.task4;

import java.util.Scanner;

public class FindingPair {
    public static void main(String[] args) {
        findPair(); // Calling the task-specific function
    }

    public static void findPair() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the size of the array:");
            int size = scanner.nextInt();
            int[] array = new int[size];

            System.out.println("Enter the array elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println("Enter the target sum:");
            int target = scanner.nextInt();

            boolean found = false;
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (array[i] + array[j] == target) {
                        System.out.println("Pair found: " + array[i] + ", " + array[j]);
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }

            if (!found) {
                System.out.println("No pair with the given sum found.");
            }
        } finally {
            scanner.close();
        }
    }
}
