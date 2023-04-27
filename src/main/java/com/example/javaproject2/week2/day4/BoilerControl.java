package com.example.javaproject2.week2.day4;

public class BoilerControl {
    public static void main(String[] args) {
        int waterTemperatrue = 45;
        int roomTemperature = 22;

        boolean check = waterTemperatrue < 50 && roomTemperature < 24;
        System.out.printf("check: %b\n", check);
    }
}
