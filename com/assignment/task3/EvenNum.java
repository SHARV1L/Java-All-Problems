package com.assignment.task3;

import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range and press Enter Key");
        int n = sc.nextInt();
        try {
            int sum = 0, count = 0, number = 2;
            while (count < n) {
                sum += number;
                number += 2;
                count++;
            }
            System.out.println("Sum of first " + n + " even numbers is: " + sum);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
