package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numbers[] = new int[num];
        for (int i=0; i<num; i++) {
            numbers[i] = sc.nextInt();
            System.out.println(numbers[i]);
        }
    }
}
