package com.example.javaproject2.week4.day3;

public class DrawDiamond2 {
    public static String getReapeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }
    public static String getRepeatedSymbolFor(String symbol, int n) {
        String answer = "";
        for (int i=0; i<n; i++) {
            answer += symbol;
        }
        return answer;
    }
    public static String makeALine(int h, int i) {
        int pivot = h / 2;
        if(i <= pivot) {
            return String.format("%s%s\n", getReapeatedSymbol("0", pivot-i), getRepeatedSymbolFor("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getReapeatedSymbol("0", i-pivot), getRepeatedSymbolFor("*", 2 * (h - i) - 1));
        }
    }
    public static void main(String[] args) {
        int h = 5;
        for (int i=0; i<h; i++) {
            System.out.println(makeALine(h, i));
        }
    }
}
