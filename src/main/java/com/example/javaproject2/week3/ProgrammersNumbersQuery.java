package com.example.javaproject2.week3;

public class ProgrammersNumbersQuery {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
        int[] answer = {};
        for (int i=0; i<queries.length; i++) {
            int temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }
        answer = arr;
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
