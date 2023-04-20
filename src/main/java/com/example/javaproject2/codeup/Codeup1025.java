package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number[] = sc.next().split("");
        System.out.println("[" + Integer.parseInt(number[0]) * 10000 + "]");
        System.out.println("[" + Integer.parseInt(number[1]) * 1000 + "]");
        System.out.println("[" + Integer.parseInt(number[2]) * 100 + "]");
        System.out.println("[" + Integer.parseInt(number[3]) * 10 + "]");
        System.out.println("[" + Integer.parseInt(number[4]) + "]");
    }
}
