package com.example.javaproject2.week4.day3;
//인터페이스 구현체
public class ConsolePrinter2 implements Printer2{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}