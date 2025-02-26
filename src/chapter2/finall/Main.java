package chapter2.finall;

public class Main {
    public static void main(String[] args) {

        // 파이널 활용 방법
        final int a=1;
        //a=2;
        System.out.println("a = " + a); //a=2 안지우면 에러


        //상수 활용 방법
        System.out.println("상수활용: " + Circle.PI);


        //불변 객체 활용
        final Circle c1 = new Circle(2); //참조형 변수
        //참조변경은 final이 막아줌
        //이미 참조값을 final로 설정했으니깐! 불변임
        //but 내부상태 변경은 막지 않음
//        c1 = new Circle(5);

        //내부 상태는 변경할 수 있음
        //이건 불변객체라고 할 수 없음
//        c1.radius = 5;

        //그래서 Circle에 radius에도 final해줌

        System.out.println("c1 = " + c1);



        //불변 객체의 내부상태가 변경이 필요한 경우
        //1. 새롭게 객체 생성
        Circle c2 = new Circle(3);

        //2. 기능으로 제공circle 클래스에서 확인
        Circle c3 = c2.changeRadius(20);

    }
}
