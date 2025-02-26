package chapter2.clazz;

import java.util.Scanner;

public class Car {
    String name;
    String color;
    boolean isDriving ;
    int speed;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Car(String name, String color) {
        this.name = name;
        this.color = color;
        this.isDriving = false;
        this.speed = 0;
    }

    void drive() {
        this.isDriving = true;
        System.out.println("주행을 시작합니다.");
    }

    void accelerate() {
        speed += 5;
        System.out.println("스피드: " + speed);
    }



}
