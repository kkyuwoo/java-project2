package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers[] = sc.nextLine().split("\\s");
        int i = 0;
        while (true) {
            if (numbers[i].equals("0")) {
                break;
            } else {
                System.out.println(numbers[i]);
                i++;
            }
        }
    }
}
