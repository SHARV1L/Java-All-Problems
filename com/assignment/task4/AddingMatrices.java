package com.assignment.task4;

import java.util.Scanner;

public class AddingMatrices {
    public static void main(String[] args) {
        addMatrices(); // Calling the task-specific function
    }

    public static void addMatrices() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the number of rows and columns of the matrices:");
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();

            int[][] matrix1 = new int[rows][cols];
            int[][] matrix2 = new int[rows][cols];

            System.out.println("Enter elements of Matrix 1:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter elements of Matrix 2:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Resultant Matrix after Addition:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print((matrix1[i][j] + matrix2[i][j]) + " ");
                }
                System.out.println();
            }
        } finally {
            scanner.close();
        }
    }
}
