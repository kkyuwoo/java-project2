package com.example.javaproject2.week2.day3;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrChallenge {
    public static void fillRow(int[][] arr, int row) {
        arr[row][0] = 1;
        arr[row][1] = 1;
        arr[row][2] = 1;
        arr[row][3] = 1;
        arr[row][4] = 1;
    }

    public static void printArray(int[][] arr) {
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int[][] arr = new int[5][5];

        fillRow(arr, row);
        printArray(arr);
    }
}
