package com.example.javaproject2.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=0; i<num; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
