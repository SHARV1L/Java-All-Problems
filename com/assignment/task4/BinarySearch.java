package com.assignment.task4;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        binarySearch(); // Calling the task-specific function
    }

    public static void binarySearch() {
        int[] array = {2, 4, 6, 8, 10}; // Predefined sorted array
        System.out.println("Array elements: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the target element to search:");
            int target = scanner.nextInt();

            int left = 0, right = array.length - 1;
            boolean found = false;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (array[mid] == target) {
                    found = true;
                    break;
                } else if (array[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            if (found) {
                System.out.println("The element " + target + " is found in the array at: ");
            } else {
                System.out.println("The element " + target + " is not found in the array.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
