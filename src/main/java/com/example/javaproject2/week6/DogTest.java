package com.example.javaproject2.week6;

public class DogTest {
    public static void main(String[] args) {
        Animal dog = new Dog(); //왼쪽에는 추상클래스, 오른쪽에는 상속받은 클래스 선언하는 게 일반적
        dog.makeSound();
        dog.eat();

        Bird bird = new Bird(); //인터페이스에 의존하지않고 구현체에 의존하는 것
        bird.makeSound();

        Ani bird2 = new Bird(); //동일한 행위를 보장하기 위해 인터페이스를 정의하고 사용한다
        Ani test = new Test(); // 인터페이스에 의존
        //Ani가 가진 모든 행위들

        bird.makeSound();
        test.makeSound();
    }
}
