package com.company;

import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        int product = 1;
        /*
        //for loop
        for(int i = 1;i<=10;i++){
            if(i%2==0) {
                product = product * i;
            }
        }

        System.out.println(product);


        //two for loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //while loop 0r entry control loop
        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }
        //do while or exit control loop
        int b = 1;
        do {
            System.out.println(b);
            b++;
        } while (b <= 10);


        //guess number game
        Scanner sc = new Scanner(System.in);
        System.out.println("i have thought number(1 to 100)");
        int compInput = (int) ((Math.random()) * 100);
        System.out.println(compInput);
        System.out.println("guess my number");
        while (true) {

            int userInput = sc.nextInt();
            if (userInput == compInput) {
                System.out.println("you won");
                break;
            }
            System.out.println("sorry,try again");
            if (compInput < userInput) {
                System.out.println("your number was greater");
            } else {
                System.out.println("your number was less ");
            }
        }

         */
        //switch statement
        int month = 2;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("wrong input");
                break;
        }
        System.out.println("done");
    }
}
