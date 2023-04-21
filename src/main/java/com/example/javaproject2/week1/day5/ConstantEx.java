package com.example.javaproject2.week1.day5;

import com.example.javaproject2.PrintHello;

public class ConstantEx {
    public static void main(String[] args) {
        final int iVal; //상수 선언. 원시타입, 참조타입 둘 다에 사용 가능. 값 변경 불가
        iVal = 1;
        System.out.println(iVal);

        final PrintHello printHello = new PrintHello(); //참조 타입에도 사용 가능
    }
}
