package com.example.javaproject2.week4.day1;

public class User {
    String name;
    String phoneNumber; // "01012345678" -> 0없어짐
    int age;

    boolean isAdult() {
        return age >= 18;
    }
}
