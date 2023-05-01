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

        //int만으로 풀이
        int answer2 = 0;
        int odd2 = 0;
        int even2 = 0;

        for(int i=0; i<num_list.length; i++) {
            if(num_list[i] % 2 ==0) {
                even2 *= 10;
                even2 += num_list[i];
            } else {
                odd2 *= 10;
                odd2 += num_list[i];
            }
        }
        answer2 = even2 + odd2;
        System.out.println(answer2);
    }
}
