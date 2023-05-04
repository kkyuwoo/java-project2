package com.example.javaproject2.week3.day3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ProgrammersFactorization {
    public static void main(String[] args) {
        int n = 12;
        int d = 2;
        int[] arr = new int[n + 1];
        int idx = 0;

        while (n > 1) {
            if (n % d == 0) {
                arr[idx++] = d;
                n /= d;
            } else {
                d++;
            }
        }
        // 0이 아닌 숫자의 개수 O(n)
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                size++;
            }
        }

        // 0이 아닌 숫자 중 중복 제거 O(n^2)
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }

        // 중복 제거한 0이 아닌 숫자를 앞에부터 넣기 O(n)
        int[] answer = new int[size];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer[index++] = arr[i];
            }
        }

        // 중복 제거한 결과 출력 O(소인수개수)
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] != 0) {
                System.out.printf("%d ", answer[i]);
            }
        }
    }
}
