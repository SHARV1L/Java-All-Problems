package com.assignment.task4;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        sortArray(new int[]{5, 2, 9, 1, 6}); // Hardcoded input array
    }

    public static void sortArray(int[] array) {
        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        Arrays.sort(array);   // sorted directly using predifined function

        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
