package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char word = sc.next().charAt(0);
        int ascii = (int) word + 1;
        System.out.println((char)ascii);
    }
}
