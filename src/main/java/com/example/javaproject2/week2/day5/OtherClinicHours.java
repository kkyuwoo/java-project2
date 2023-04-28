package com.example.javaproject2.week2.day5;

public class OtherClinicHours {
    public static void main(String[] args) {
        String day = "화";
        String time = "휴진";
        switch (day) {
            case "월", "화", "수", "목", "금": time = "09:15-18:30"; break;
            case "토": time = "09:30-14:00"; break;
            case "일": time = "휴진"; break;
        }
        System.out.printf("%s요일은 %s입니다.", day, time);
    }
}
