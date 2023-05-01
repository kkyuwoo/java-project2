package com.example.javaproject2.week3;

public class ForLoopForwardStep {
    public static void main(String[] args) {
        System.out.print("짝 : ");
        for(int i=2; i<=10; i+=2) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.print("홀 : ");
        for(int i=1; i<=10; i+=2) {
            System.out.printf("%d ", i);
        }
    }
}
