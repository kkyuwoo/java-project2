package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = arr[0][0];
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if (arr[i][j] == max) {
                    System.out.printf("%d %d\n", i+1, j+1);
                }
            }
        }
    }
}
