package com.assignment.task2;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try {
            for (int i = 1; i <= n; i++) {
                if (i < 0) {
                    System.out.println("It's Over");
                    break;
                }
                if (i > 0) {
                    System.out.println("Good Going: " + i);
                    continue;
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        sc.close();
    }
}
