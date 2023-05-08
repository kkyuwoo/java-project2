package com.example.javaproject2.week4.day1;

public class SumFactors {
    public int sumOfFactors(int num) {
        int result = 0;
        for(int i=1; i<=num; i++) {
            if (num % i == 0) {
                result += i;
            }
        }
        return result;
    }

    public void printResult(int num) {
        System.out.printf("%d의 약수의 합은 %d입니다.\n", num, sumOfFactors(num));
    }

    public static void main(String[] args) {
        SumFactors sumFactors = new SumFactors();
        sumFactors.printResult(12);
        sumFactors.printResult(36);
        sumFactors.printResult(48);
        sumFactors.printResult(29);
    }
}
