package com.example.javaproject2.week4.day2;

public class PyramidReverse {
    private String spaceChar = "0";

    public PyramidReverse(String spaceChar) {
        this.spaceChar = spaceChar;
    }
    //메소드로 핵심기능 분리
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(h + 3 - (i * 2)));
    }
    public static void main(String[] args) {
        PyramidReverse reversePyramid = new PyramidReverse("0");
        int h = 4;
        for (int i = 0; i < h; i++) {
            System.out.printf(reversePyramid.makeALine(h, i));
        }
    }
}
