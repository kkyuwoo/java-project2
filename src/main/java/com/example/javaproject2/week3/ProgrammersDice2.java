package com.example.javaproject2.week3;

public class ProgrammersDice2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 1;
        double answer = 0;
        if (a != b && b != c && a != c) {
            answer = a + b + c;
        } else if ((a == b && a != c) || (a == c && b != c) || (b == c && a != b)) {
            answer = (a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        } else if (a == b && b == c) {
            answer = (a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2))*(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        }
        System.out.printf("%.0f",answer);
    }
}
