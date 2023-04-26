package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        int i = 0;
        while(true) {
            if (result >= num) {
                System.out.println(i);
                break;
            } else {
                i++;
                result += i;
            }
        }
    }
}
