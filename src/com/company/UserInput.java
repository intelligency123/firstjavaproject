package com.company;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100");
        int number = sc.nextInt();
        congratsPrint(number);
        System.out.println("Enter a month from 1 to 12");
        int month = sc.nextInt();
        daysOfMonth(month);
    }
    //print congratulations if number is between 1 and 100 by taking input from user
    public static void congratsPrint(int num){
        if(num >1 && num <100){
            System.out.println("Congratulations");
        }else{
            System.out.println("you loss");
        }
    }
    //print the days of month entered by the user
    public static void daysOfMonth(int month){
        if(month == 1 || month == 3 ||month == 5 || month == 7 || month == 8 || month == 10 || month ==12){
            System.out.println("This month has 31 days");
        }else if(month == 2){
            System.out.println("This month has 28 days");
        }else if(month == 4 || month == 6 ||month == 9 || month == 11 ) {
            System.out.println("This month has 30 days");
        }else{
            System.out.println("please enter value from 1 to 12");
        }
        }

}
