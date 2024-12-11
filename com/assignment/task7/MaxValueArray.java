package com.assignment.task7;

public class MaxValueArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 5, 30, 25};
        findMaxValue(array);
    }

    public static void findMaxValue(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Maximum Value: " + max);
    }
}
