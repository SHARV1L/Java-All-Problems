package com.assignment.task3;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number and press Enter Key");
        int num = sc.nextInt();

        try {
            boolean isPrime = num > 1;
            for (int i = 2; i <= Math.sqrt(num); i++) {  // We have done this as we know that more than half of a nnumber would never divide that number so why iterate till the end.
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
