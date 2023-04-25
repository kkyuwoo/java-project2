package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month) {
            case 1, 2, 12: //intelliJ에서는 되는데 Codeup에서는 컴파일 에러 나서 Codeup case1: case2: ... 이런식으로 바꿈
                System.out.println("winter");
                break;
            case 3, 4, 5:
                System.out.println("spring");
                break;
            case 6, 7, 8:
                System.out.println("summer");
                break;
            case 9, 10, 11:
                System.out.println("fall");
                break;
        }
    }
}
