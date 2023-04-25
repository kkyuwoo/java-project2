package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0) {
            if(num < 0) {
                System.out.println("minus");
            } else {
                System.out.println("plus");
            }
            System.out.println("even");
        } else {
            if (num < 0) {
                System.out.println("minus");
            } else {
                System.out.println("plus");
            }
            System.out.println("odd");
        }
    }
}
