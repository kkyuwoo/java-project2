package com.example.javaproject2.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers[] = sc.nextLine().split("\\s");
        int i = 0;
        while (true) {
            if (numbers[i].equals("q")) {
                System.out.print(numbers[i]);
                break;
            } else {
                System.out.println(numbers[i]);
                i++;
            }
        }
    }
}
