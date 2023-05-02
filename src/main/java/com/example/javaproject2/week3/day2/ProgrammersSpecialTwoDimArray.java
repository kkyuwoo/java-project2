package com.example.javaproject2.week3.day2;

import java.util.Arrays;

public class ProgrammersSpecialTwoDimArray {
    public static void main(String[] args) {
        int n = 3;
        int[][] result = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if (i==j) {
                    result[i][j] = 1;
                }
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
