package com.assignment.task4;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        linearSearch(); 
    }

    public static void linearSearch() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the size of the array:");
            int size = sc.nextInt();
            int[] array = new int[size];  // We have taken the size of the array

            System.out.println("Enter the array elements:");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();   // Here we will enter the array elements
            }

            System.out.println("Enter the target element to search:");
            int target = sc.nextInt();   // We will ask the user to enter the element to be searched in the array

            boolean found = false;   
            for (int i : array) {
                if (i == target) {
                    found = true;
                    break;
                }
            }

            if(found){
                System.out.println("Number found");
            } else {
                System.out.println("Number not found");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
