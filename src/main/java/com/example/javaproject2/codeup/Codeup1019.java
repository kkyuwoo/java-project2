package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date[] = sc.next().split("[.]"); //.을 문자 취급
        //String date[] = sc.next().split("//."); 도 가능
        System.out.printf("%04d.%02d.%02d", Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
    }
}