package com.company;

public class Array {
    public static void main(String[] args) {
        int marks[] = new int[5];
        for(int i=0;i<5;i++){
            marks[i] = 10;
        }
        int s = 0;
        for(int i=0;i<5;i++){
            s=s+marks[i];
        }
        System.out.println(s);
        int arr[][]=new int[][]{
                {1,2,3,4},
                {3,4,5,5},
                {5,6,7,4}

        };
        for(int i=0;i<3;i++){
            int d =0;
            for(int j=0;j<4;j++){
               // System.out.print(arr[i][j]+" ");
                d=d+arr[i][j];
            }
            System.out.println(d);
        }
    }
}
