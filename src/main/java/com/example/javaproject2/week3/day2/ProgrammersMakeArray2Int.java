package com.example.javaproject2.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgrammersMakeArray2Int {
    // 주어진 정수가 "0" 또는 "5"로만 이루어졌는지 확인하는 함수
    private static boolean isOnly05(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        List<Integer> resultList = new ArrayList<Integer>();
        int l = 5;
        int r = 10000;

        for (int i = l; i <= r; i++) {
            if (isOnly05(i)) {
                resultList.add(i);
            }
        }

        if (resultList.size() == 0) {
            int[] answer = new int[] {-1};
            System.out.println(Arrays.toString(answer));
        }

        // 결과 리스트를 int 배열로 변환하여 반환합니다.
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
