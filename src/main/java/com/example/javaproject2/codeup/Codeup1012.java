package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        String str = String.format("%.6f", x);
        System.out.println(str);
    }
}
