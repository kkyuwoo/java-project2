package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        //오름차순으로 정렬하는 알고리즘을 만들어보세요. 같은 알고리즘이 있음
        //arr[0], arr[1] 순서 바꾸기
        int[] arr = {2, 1, 4, 8, 7, 6};
        int temp = arr[0]; //arr[0]값 임시저장
        arr[0] = arr[1]; //arr[0]에 arr[1]값 대입
        arr[1] = temp; //arr[1]에 임시저장한 arr[0]값 대입

        System.out.println(Arrays.toString(arr));
    }
}
