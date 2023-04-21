package com.example.javaproject2.week1.day5;

public class Point {
    int x;
    int y;

    boolean isSameXy() {
        //x와 y가 같나?
        return x == y;
    }

    //도전 과제 (두 점 사이의 거리 구하기)
    double getDistance(Point p2) {
        int xL = p2.x - this.x;
        int yL = p2.y - this.y;
        //두 점 사이 거리 구하는 공식 : Math.sqrt((x2-x1)^2+(y2-y1)^2)
        double sumOfPow = Math.pow(xL, 2) + Math.pow(yL, 2);
        double result = Math.sqrt(sumOfPow);

        return result;
    }
}
