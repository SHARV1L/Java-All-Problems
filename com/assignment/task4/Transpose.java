package com.assignment.task4;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        transposeMatrix(); // Calling the task-specific function
    }

    public static void transposeMatrix() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the number of rows and columns of the matrix:");
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();

            int[][] matrix = new int[rows][cols];
            System.out.println("Enter elements of the matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Original Matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Transposed Matrix:");
            for (int j = 0; j < cols; j++) {
                for (int i = 0; i < rows; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        } finally {
            scanner.close();
        }
    }
}
