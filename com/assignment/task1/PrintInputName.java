package com.assignment.task1;

import java.util.Scanner;

public class PrintInputName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userName = sc.nextLine();
        System.out.println(userName);
        sc.close();
    }
}
