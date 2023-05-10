package com.example.javaproject2.week4.day3;

public class DiamondShapeDrawer extends ShapeDrawer2{
    public static String getRepeatedSymbolFor(String symbol, int n) {
        String answer = "";
        for (int i=0; i<n; i++) {
            answer += symbol;
        }
        return answer;
    }
    @Override
    public String makeALine(int h, int i) {
        int pivot = h / 2;
        if(i <= pivot) {
            return String.format("%s%s\n", getRepeatedSymbolFor(" ", pivot-i), getRepeatedSymbolFor("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatedSymbolFor(" ", i-pivot), getRepeatedSymbolFor("*", 2 * (h - i) - 1));
        }
    }

    public static void main(String[] args) {
        ShapeDrawer2 sd = new DiamondShapeDrawer();
        sd.printShape(5);
    }
}
