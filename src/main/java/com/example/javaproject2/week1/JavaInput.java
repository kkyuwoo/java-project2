package com.example.javaproject2.week1;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readAChar() throws IOException { //인풋하면서 에러가 나면 호출하는 곳에 던진다
        InputStreamReader is = new InputStreamReader(System.in);
        //is.read(); // alt + Enter
        System.out.println(is.read());
    }

    public void readTwoChars() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        int asciiCode1 = is.read();
        int asciiCode2 = is.read();

        System.out.println(asciiCode1);
        System.out.println(asciiCode2);
    }
}
