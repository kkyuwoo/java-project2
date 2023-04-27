package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();
        for(int i = 1; i<=p1*p2*p3; i++) {
            if(i % p1 == 0 && i % p2 == 0 && i % p3 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
