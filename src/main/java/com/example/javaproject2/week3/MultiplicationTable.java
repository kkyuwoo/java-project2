package com.example.javaproject2.week3;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            // 2 4 6 8
            System.out.printf("2 * %d = %d\n", i, i * 2);
        }
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            System.out.printf("3 * %d = %d\n", i, i * 3);
        }
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            System.out.printf("4 * %d = %d\n", i, i * 4);
        }
    }
}
