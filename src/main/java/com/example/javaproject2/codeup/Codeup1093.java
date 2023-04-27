package com.example.javaproject2.codeup;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[23];
        for(int i=0; i<n; i++) {
            count[sc.nextInt()-1] += 1;
        }
        for(int i=0; i<count.length; i++) {
            System.out.print(count[i] + " ");
        }
    }
}
