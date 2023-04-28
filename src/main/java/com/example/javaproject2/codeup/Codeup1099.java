package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int spot = 1;
        boolean arrive = false;
        for(int i=1; i<10; i++) {
            if(arrive) {
                break;
            }
            for(int j=spot; j<10; j++) {
                if(arr[i][j] == 0) {
                    arr[i][j] = 9;
                } else if(arr[i][j] == 1) {
                    spot = j-1;
                    break;
                } else {
                    arrive = true;
                    arr[i][j] = 9;
                    break;
                }
            }
        }

        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
