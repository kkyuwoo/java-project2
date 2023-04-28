package com.example.javaproject2.week2.day4;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeProgrammersSecretMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        String[] arr1Binary = new String[n];
        String[] arr2Binary = new String[n];
        String[] result = {"", "", "", "", ""};

        for(int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
            arr1Binary[i] = String.format("%05d", Integer.parseInt(Integer.toBinaryString(arr1[i])));
        }
        for(int i=0; i<n; i++) {
            arr2[i] = sc.nextInt();
            arr2Binary[i] = String.format("%05d", Integer.parseInt(Integer.toBinaryString(arr2[i])));
        }
        //System.out.println(Arrays.toString(arr1Binary));
        //System.out.println(Arrays.toString(arr2Binary));

        for(int i=0; i<n; i++) {
            result[i] += "\"";
            for(int j=0; j<n; j++) {
                //System.out.println((int) arr1Binary[i].charAt(j)-'0');
                //System.out.println((int) arr2Binary[i].charAt(j)-'0');
                if ((int) (arr1Binary[i].charAt(j)-'0') == 1 || (int) arr2Binary[i].charAt(j)-'0' == 1) {
                    result[i] += "#";
                } else {
                    result[i] += " ";
                }
            }
            result[i] += "\"";
        }
        System.out.println(Arrays.toString(result));
    }
}       
