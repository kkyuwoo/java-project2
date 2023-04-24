package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char word = sc.next().charAt(0); //String으로 저장된 문자열 중에서 한 글자(index 번째 글자)만 선택해서 Char 타입으로 변환
        int num = (int) word; //char를 int로 형 변환
        System.out.println(num);
    }
}
