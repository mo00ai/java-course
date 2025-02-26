package chapter2.finall;

public class Circle {

    //속성
    final static double PI = 3.14159265358979323846;
    final double radius;

    //생성자
    Circle(double radius) {
        this.radius = radius;
    }

    //기능
    Circle changeRadius(double newRadius) {
        return new Circle(newRadius);
        //메서드로 생성자를 다시 호출해주면 됨
        //내부적으로 생성자 호출
    }


}
