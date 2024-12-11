package com.assignment.task4;

public class Average {
    public static void main(String[] args) {
        calculateAverage(new int[]{2, 4, 6, 8}); // Hardcoded input array
    }

    public static void calculateAverage(int[] a) {
            int sum = 0;
            for (int i : a) { // looping until the end of array and adding all the elements 
                sum += i;
            }
            double average = (double) sum / a.length;   // typecasted with 'double' type in case of decimal values
            System.out.println("Average: " + average);
    }
}
