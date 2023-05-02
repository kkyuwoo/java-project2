package com.example.javaproject2.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgrammersMakeArray2 {
    public static void main(String[] args) {
        int l = 5;
        int r = 555;
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i=l; i<=r; i++) {
            if(Integer.toString(i).contains("1") || Integer.toString(i).contains("2") || Integer.toString(i).contains("3") || Integer.toString(i).contains("4") || Integer.toString(i).contains("6") || Integer.toString(i).contains("7") || Integer.toString(i).contains("8") || Integer.toString(i).contains("9")) {
                continue;
            } else {
                answer.add(i);
            }
        }
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        System.out.println(answer.toString());
    }
}
