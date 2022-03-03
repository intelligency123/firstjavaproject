package com.company;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = sc.nextInt();
        System.out.println("Enter second number");
        int second = sc.nextInt();
        System.out.println("Enter third number");
        int third = sc.nextInt();
        compareNumber(first, second, third);


    }

    public static void compareNumber(int a, int b, int c) {
        if (a == b && a == c) {
            System.out.println("All entered numbers are equal");
        } else {
            System.out.println("All entered numbers are different");
        }
    }
}
