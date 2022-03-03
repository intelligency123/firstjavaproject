package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int i = 0;
        int x = 0;
        int x1 = 0;
        int x2 = 0;
        System.out.println(++i);
        System.out.println(x++);
        System.out.println(--x1);
        System.out.println(x2--);
        // oprational operator
        int f = 2;
        if(f>2 && f<100){
            System.out.println("loss");
        }
        if(f>2 || f<100){
            System.out.println("congrats");
        }
        // Scanner class
        System.out.println("please enter month here 1 to 12");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        //int month = 3;
        if(month == 1 || month == 2 || month == 3){
            System.out.println("31 days");
        }

        int sum = sum(2, 6);
        System.out.println(sum);
        multiply(4, 5);
    }

    public static int sum(int a, int b) {
        return (a + b);
    }

    public static void multiply(int first, int second) {
        System.out.println("Result is : " + first * second);
    }


}
