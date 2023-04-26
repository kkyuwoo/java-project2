package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        int result = 0;
        int i = 1;
        while(true) {
            if(result>=num) {
                break;
            } else {
                result += i;
                i++;
            }
        }
        System.out.print(result);
    }
}
