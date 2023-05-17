package com.example.javaproject2.week5.day3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack1 {
    private int[] arr = new int[10000];
    private int pointer = 0;
    public void push(int value) {
        this.arr[pointer++] = value;
        //System.out.println(Arrays.toString(arr));
        //System.out.println("pointer = " + pointer);;
    }
    public int pop() {
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[--pointer];
        //int temp = this.arr[pointer-1]; //직관적 방법. 위랑 동일
        //pointer--;
        //return temp;
    }
    public boolean isEmpty() {
        return this.pointer == 0;
    }

    public int peek() {
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[pointer-1];
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        System.out.println(st.peek());
    }
}
