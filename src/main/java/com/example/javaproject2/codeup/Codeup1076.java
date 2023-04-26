package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alpha = sc.next().charAt(0);
        int ascii = (int)'a';
        do {
            System.out.print((char)ascii + " ");
            ascii++;
        } while(ascii <= (int)alpha);
    }
}
