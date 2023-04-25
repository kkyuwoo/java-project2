package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1020SubString {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String number = sc.next();
            String number1 = number.substring(0,6);
            String number2 = number.substring(7,14);
            System.out.println(number1 + number2);
    }
}
