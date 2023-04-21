package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.next();
        int hexa = Integer.parseInt(val, 16);
        System.out.printf("%o", hexa);
    }
}
