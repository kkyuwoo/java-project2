package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        System.out.printf("%.0f", a*Math.pow(r, (n-1)));
    }
}
