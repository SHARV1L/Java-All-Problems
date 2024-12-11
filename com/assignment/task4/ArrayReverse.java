package com.assignment.task4;

public class ArrayReverse {
    public static void main(String[] args) {
        reverseArray(new int[]{1, 2, 3, 4, 5}); // Hardcoded input array
    }

    public static void reverseArray(int[] array) {
        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Reversed Array:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
