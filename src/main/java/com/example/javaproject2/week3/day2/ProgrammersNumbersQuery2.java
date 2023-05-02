package com.example.javaproject2.week3.day2;

import java.util.Arrays;

public class ProgrammersNumbersQuery2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        int[] answer = new int[queries.length];
        Arrays.fill(answer, Integer.MAX_VALUE);

        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    answer[i] = Math.min(answer[i], arr[j]);
                }
            }
            if (answer[i] == Integer.MAX_VALUE) answer[i] = -1;
        }
        System.out.println(Arrays.toString(answer));
    }
}
