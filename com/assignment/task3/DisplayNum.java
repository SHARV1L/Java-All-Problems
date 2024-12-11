package com.assignment.task3;

import java.util.Scanner;

public class DisplayNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        try {
            System.out.println("Enter numbers (type 'done' to finish):");   
            // you can type anything other than a number to finsih the input as the hasNextInt() function
            // will only proceed with the rest of the code if the input are numbers(Integers).
            while (sc.hasNextInt()) {
                int n = sc.nextInt();

                if (n > largest) {
                    largest = n;
                }
                if (n < smallest) {
                    smallest = n;
                }
            }

            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
        } catch (Exception e) {
            System.out.println("Input finished.");
        } finally {
            sc.close();
        }
    }
}
