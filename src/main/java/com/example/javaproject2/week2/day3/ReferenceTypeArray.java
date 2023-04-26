package com.example.javaproject2.week2.day3;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] studnets = new Student[2]; //배열의 초기화
        studnets[0] = new Student(); //Student 클래스의 초기화
        studnets[0].name = "김경록"; //Student 클래스 초기화 후 가능
        studnets[0].phoneNumber = "010-1234-5678";
        studnets[0].age = 37;
        studnets[1] = new Student();
        studnets[1].name = "김지유";
        studnets[1].phoneNumber = "010-2468-1357";
        studnets[1].age = 2;
    }
}
