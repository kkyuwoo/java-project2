package com.example.javaproject2.week3;

public class ProgrammersLinkedNumber {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        int answer = 0;
        String even = "";
        String odd = "";
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] % 2 ==0) {
                even = even.concat(Integer.toString(num_list[i]));
            } else {
                odd = odd.concat(Integer.toString(num_list[i]));
            }
        }
        System.out.println(Integer.parseInt(even) + Integer.parseInt(odd));
    }
}
