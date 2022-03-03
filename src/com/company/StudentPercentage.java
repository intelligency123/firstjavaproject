package com.company;

import java.util.Scanner;

public  class StudentPercentage {

    public static    void main(String[] args) {

        percentageCalc();
    }

    public static void percentageCalc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for english subject");
        int english = sc.nextInt();
        System.out.println("Enter marks for science subject");
        int science = sc.nextInt();
        System.out.println("Enter marks for math subject");
        int math = sc.nextInt();
        System.out.println("Enter marks for french subject");
        int french = sc.nextInt();
        System.out.println("Enter marks for social subject");
        int social = sc.nextInt();
        int totalSum = english + science + math + french + social;
        int totalMarks = 500;
        float percentage = (totalSum * 100) / 500;
        System.out.println("Your total percentage is " + percentage + "%");
        if (percentage > 80) {
            System.out.println("Grade A");
        } else if (percentage >= 70 && percentage < 80) {
            System.out.println("Grade B");
        } else if (percentage >= 60 && percentage < 70) {
            System.out.println("Grade C");
        } else if (percentage < 60 && percentage >= 40) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }
}
