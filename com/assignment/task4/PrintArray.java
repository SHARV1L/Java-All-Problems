package com.assignment.task4;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Where I'm taking user Input I definitely try using try catch and finally blocks to make sure our program runs smooth.
        try {
            System.out.println("Enter the size of the array:");
            int size = sc.nextInt();
            int[] array = new int[size];

            System.out.println("Enter the array elements:");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            System.out.print("Array elements: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
