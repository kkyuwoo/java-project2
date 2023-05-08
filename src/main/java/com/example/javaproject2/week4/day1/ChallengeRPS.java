package com.example.javaproject2.week4.day1;

import java.util.Random;
import java.util.Scanner;

public class ChallengeRPS {
    public String calcuate(String user, String com) {
        String result = "";
        if (user.equals("바위")) {
            if (com.equals("바위")) {
                result = "tie";
            } else if  (com.equals("가위")) {
                result = "win";
            } else {
                result = "lose";
            }
        } else if (user.equals("가위")) {
            if (com.equals("가위")) {
                result = "tie";
            } else if  (com.equals("보")) {
                result = "win";
            } else {
                result = "lose";
            }
        } else {
            if (com.equals("보")) {
                result = "tie";
            } else if  (com.equals("바위")) {
                result = "win";
            } else {
                result = "lose";
            }
        }
        return result;
    }

    public String getRandRange(int from, int to) {
        Random random = new Random();
        int rand = random.nextInt(3);
        String result = "";
        switch (rand) {
            case 0 -> result = "바위";
            case 1 -> result = "가위";
            case 2 -> result = "보";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChallengeRPS challengeRPS = new ChallengeRPS();
        while (true) {
            String num = sc.next();
            String result = challengeRPS.calcuate(num, challengeRPS.getRandRange(0, 2));
            System.out.println(result);
            if (result.equals("win")) {
                break;
            }
        }
    }
}
