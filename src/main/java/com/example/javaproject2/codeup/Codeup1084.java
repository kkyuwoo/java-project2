package com.example.javaproject2.codeup;

import com.example.javaproject2.week1.BufferedReaderEx;

import java.io.*;
import java.util.Scanner;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        /* Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        for(int i=0; i<r; i++) {
            for (int j=0; j<g; j++) {
                for (int k=0; k<b; k++) {
                    result++;
                }
            }
        }
        System.out.println(result); */ //원래 작성한 코드. 시간초과
        //BufferedReader와 BufferedWriter 사용. 입출력 시간 단축
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] val = br.readLine().split(" ");
        int result = 0;
        for(int i=0; i<Integer.valueOf(val[0]); i++) {
            for(int j=0; j<Integer.valueOf(val[1]); j++) {
                for(int k=0; k<Integer.valueOf(val[2]); k++) {
                    bw.write(i + " " + j + " " + k + "\n");
                    result++;
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
