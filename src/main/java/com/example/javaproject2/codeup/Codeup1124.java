package com.example.javaproject2.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] chemical = sc.nextLine().split("C|H");
        System.out.println(Integer.parseInt(chemical[1])*12 + Integer.parseInt(chemical[2]));
    }
}
