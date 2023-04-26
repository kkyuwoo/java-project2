package com.example.javaproject2.week2.day3;

public class Remainder687Sum {
    public static void main(String[] args) {
        int num = 687;
        int firstRemainder = num % 10; //687을 10으로 나눈 나머지
        num = num / 10; //num = 68
        int secondRemainder = num % 10; //68을 10으로 나눈 나머지
        num = num / 10; //num = 6
        int thirdRemainder = num % 10; //6을 10으로 나눈 나머지
        System.out.println(firstRemainder + secondRemainder + thirdRemainder);
    }
}
