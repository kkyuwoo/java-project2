package com.example.javaproject2.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); //세로
        int w = sc.nextInt(); //가로
        int n = sc.nextInt(); //개수
        int[][] arr = new int[h][w];

        for(int i=0; i<n; i++) {
            int l = sc.nextInt(); //길이
            int d = sc.nextInt(); //방향
            int x = sc.nextInt(); //좌표
            int y = sc.nextInt();

            for(int j=0; j<l; j++) {
                if(d==0) {
                    arr[x-1][y-1+j] = 1;
                } else {
                    arr[x-1+j][y-1] = 1;
                }
            }

            /* if (d == 0) {
                for(int j=y; j<y+l; j++) {
                    arr[x-1][j-1] = 1;
                }
            } else {
                for(int k=x; k<x+l; k++) {
                    arr[k-1][y-1] = 1;
                }
            }*/
        }
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
