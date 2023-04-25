package com.example.javaproject2.week2.day2;

import java.util.Arrays;

public class ArrayDefineAndPrint {
    public static void main(String[] args) {
        int[] iArr = new int[3];
        System.out.println(iArr[0]); //iArr의 첫 번째 값
        System.out.println(Arrays.toString(iArr)); //배열의 모든 내용 출력

        int [] iArr2 = new int[]{1, 2, 3, 8};
        System.out.printf("%d %d %d %d", iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
    }
}