package com.example.javaproject2.week4.day2;

public class PyramidShapeDrawer extends ShapeDrawer{

    @Override //추상 메소드 오버라이딩
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - i - 1), "*".repeat(2 * i + 1));
    }
}