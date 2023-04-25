package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();
        if (grade.equals("A")) {
            System.out.println("best!!!");
        } else if (grade.equals("B")) {
            System.out.println("good!!");
        } else if (grade.equals("C")) {
            System.out.println("run!");
        } else if (grade.equals("D")) {
            System.out.println("slowly~");
        } else {
            System.out.println("what?");
        }
    }
}
