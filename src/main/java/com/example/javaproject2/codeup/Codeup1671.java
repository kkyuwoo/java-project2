package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1671 {

    public String calcuate(int gwang, int com) {
        String result = "";
        if (gwang == 0) {
            if (com == 0) {
                result = "tie";
            } else if  (com == 1) {
                result = "win";
            } else {
                result = "lose";
            }
        } else if (gwang == 1) {
            if (com == 1) {
                result = "tie";
            } else if  (com == 2) {
                result = "win";
            } else {
                result = "lose";
            }
        } else {
            if (com == 2) {
                result = "tie";
            } else if  (com == 0) {
                result = "win";
            } else {
                result = "lose";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gwang = sc.nextInt();
        int com = sc.nextInt();
        Codeup1671 codeup1671 = new Codeup1671();
        System.out.println(codeup1671.calcuate(gwang, com));
    }
}
