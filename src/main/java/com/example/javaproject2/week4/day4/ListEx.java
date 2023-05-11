package com.example.javaproject2.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("Hello"); //리스트에 값 넣을 때 add
        l1.add(1);
        System.out.println(l1.get(0)); //리스트에 값 뽑을 때 get
        System.out.println(l1.get(1));
        System.out.println(l1.size()); //리스트 크기
        System.out.println(l1.isEmpty());
        //l1.remove(0); //인덱스 지정해서 원소 지우기
        //l1.remove(0); //지우면 인덱스 밀림
        System.out.println(l1.isEmpty());

        System.out.println("-----------");
        for(var item : l1) {
            System.out.println(item);
        }
    }
}
