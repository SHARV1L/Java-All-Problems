package com.assignment.task2;

public class Income {
    public static void main(String[] args) {
        // Here was well, for simplicity sake, I'll just pass the values using the function call.
        int income = 750000;
 
        try {
            double tax;
            if (income <= 250000) {
                tax = 0;
            } else if (income <= 600000) {
                tax = 0.1 * (income - 250000);
            } else if (income <= 1200000) {
                tax = 0.1 * 350000 + 0.18 * (income - 600000);
            } else {
                tax = 0.1 * 350000 + 0.18 * 600000 + 0.25 * (income - 1200000);
            }
            System.out.println("Income Tax: " + tax);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}