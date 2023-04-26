package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble(); //1초 동안 마이크로 소리강약을 체크하는 수
        double b = sc.nextDouble(); //한 번 체크한 결과를 저장하는 비트
        double c = sc.nextDouble(); //좌우 등 소리를 저장할 트랙 개수인 채널 c
        double s = sc.nextDouble(); //녹음할 시간
        double result = h*b*c*s/1024/1024/8;
        System.out.printf("%.1f MB", result);
    }
}
