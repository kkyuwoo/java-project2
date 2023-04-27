package com.example.javaproject2.week2.day4;

public class BitOperatorEx {
    public static void main(String[] args) {
        int val1 = 1;
        System.out.println(val1 << 1); //곱하기2 한칸 왼쪽으로
        System.out.println(val1 << 2); //곱하기4 두칸 왼쪽으로
        System.out.println(val1 << 3); //곱하기8 세칸 왼쪽으로

        int val2 = 32;
        System.out.println(val2 >> 1); //나누기2 한칸 오른쪽으로
        System.out.println(val2 >> 2); //나누기4 두칸 오른쪽으로
        System.out.println(val2 >> 3); //나누기8 세칸 오른쪽으로
    }
}
